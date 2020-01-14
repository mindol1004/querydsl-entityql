package pl.exsio.querydsl.entityql;

import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Projections;
import pl.exsio.querydsl.entityql.entity.scanner.JpaQEntityScanner;
import pl.exsio.querydsl.entityql.entity.scanner.QEntityScanner;

import java.util.LinkedList;
import java.util.List;

/**
 * Convenience class for obtaining instances of the Q class - dynamic QueryDSL Models
 */
public class EntityQL {

    /**
     * @param entityClass - source Entity class
     * @return - corresponding Q class
     */
    public static <E> Q<E> qEntity(Class<E> entityClass) {
        return qEntity(entityClass, new JpaQEntityScanner());
    }

    /**
     * Variables are serving as Table Aliases in generated SQL Statements
     * Default variable is always equal to the table name itself.
     * Custom variable is handy if we want to use the same Table multiple
     * times in the same SQL query.
     *
     * @param entityClass - source Entity class
     * @param variable - custom variable name
     * @return - corresponding Q class with a custom variable name
     */
    public static <E> Q<E> qEntity(Class<E> entityClass, String variable) {
        return qEntity(entityClass, new JpaQEntityScanner(), variable);
    }

    /**
     * EntityQL works by default with JPA Meta-Annotations from javax.persistence package
     * If however you want to use other way of obtaining the Entity Metadata, you can implement
     * your own QEntityScanner and construct Q classes with it.
     *
     * @param entityClass - source Entity class
     * @param scanner - custom EntityScanner
     * @return - corresponding Q class
     */
    public static <E> Q<E> qEntity(Class<E> entityClass, QEntityScanner scanner) {
        return QFactory.get(entityClass, scanner).create(true);
    }

    /**
     * EntityQL works by default with JPA Meta-Annotations from javax.persistence package
     * If however you want to use other way of obtaining the Entity Metadata, you can implement
     * your own QEntityScanner and construct Q classes with it.
     *
     * Variables are serving as Table Aliases in generated SQL Statements
     * Default variable is always equal to the table name itself.
     * Custom variable is handy if we want to use the same Table multiple
     * times in the same SQL query.
     *
     * @param entityClass - source Entity class
     * @param scanner - custom EntityScanner
     * @param variable - custom variable name
     * @return - corresponding Q class
     */
    public static <E> Q<E> qEntity(Class<E> entityClass, QEntityScanner scanner, String variable) {
        return QFactory.get(entityClass, scanner).create(variable, true);
    }

    static <E> Q<E> qEntityWithoutMappings(Class<E> entityClass, QEntityScanner scanner) {
        return QFactory.get(entityClass, scanner).create(false);
    }

    /**
     * Convenience method for performing Projections using the Q::columns(...) method.
     *
     * Example:
     *
     * List<Book> books = queryFactory.query()
     *                 .select(
     *                         dto(Book, book.columns("id", "name", "desc", "price"))
     *                 ).from(book).fetch();
     *
     * @param dtoClass - class of a DTO to create Projection
     * @param expressionList - array of Lists of Expressions
     * @return - built QueryDSL's ConstructorExpression
     */
    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <T> ConstructorExpression<T> dto(Class<? extends T> dtoClass, List<Expression<?>>... expressionList) {
        List<Expression<?>> allExpressions = new LinkedList<>();
        for (List<Expression<?>> expressions : expressionList) {
            allExpressions.addAll(expressions);
        }
        return Projections.constructor(dtoClass, allExpressions.toArray(new Expression[0]));
    }
}
