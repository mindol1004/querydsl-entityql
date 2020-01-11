package pl.exsio.querydsl.entityql.config.entity.generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.sql.ForeignKey;
import com.querydsl.sql.PrimaryKey;
import pl.exsio.querydsl.entityql.QColumnMetadataFactory;
import pl.exsio.querydsl.entityql.QPathConfig;
import pl.exsio.querydsl.entityql.QPathFactory;
import pl.exsio.querydsl.entityql.QStaticModel;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
public final class QJOrderItem
    extends QStaticModel<pl.exsio.querydsl.entityql.config.entity.JOrderItem> {

  public static final QJOrderItem INSTANCE = new QJOrderItem();

  public final NumberPath<java.lang.Long> id;

  public final NumberPath<java.lang.Long> quantity;

  public final NumberPath<java.lang.Long> bookId;

  public final NumberPath<java.lang.Long> orderId;

  public final ForeignKey<pl.exsio.querydsl.entityql.config.entity.JBook> book;

  public final ForeignKey<pl.exsio.querydsl.entityql.config.entity.JOrder> order;

  public final PrimaryKey<pl.exsio.querydsl.entityql.config.entity.JOrderItem> _primaryKey;

  public QJOrderItem() {
    this("JORDER_ITEMS");
  }

  @SuppressWarnings(value = "unchecked")
  public QJOrderItem(String variable) {
    super(pl.exsio.querydsl.entityql.config.entity.JOrderItem.class, variable, "", "JORDER_ITEMS");

    id:
    {
      this.id =
          QPathFactory.<NumberPath<java.lang.Long>>create(
              this,
              new QPathConfig(
                  java.lang.Long.class, java.lang.Long.class, "ORDER_ITEM_ID", true, 1, -5));

      addMetadata(this.id, QColumnMetadataFactory.create("ORDER_ITEM_ID", 1, -5, true));
    }

    quantity:
    {
      this.quantity =
          QPathFactory.<NumberPath<java.lang.Long>>create(
              this,
              new QPathConfig(java.lang.Long.class, java.lang.Long.class, "QTY", false, 4, -5));

      addMetadata(this.quantity, QColumnMetadataFactory.create("QTY", 4, -5, false));
    }

    bookId:
    {
      this.bookId =
          QPathFactory.<NumberPath<java.lang.Long>>create(
              this,
              new QPathConfig(java.lang.Long.class, java.lang.Long.class, "BOOK_ID", false, 2, -5));

      addMetadata(this.bookId, QColumnMetadataFactory.create("BOOK_ID", 2, -5, false));
    }

    orderId:
    {
      this.orderId =
          QPathFactory.<NumberPath<java.lang.Long>>create(
              this,
              new QPathConfig(
                  java.lang.Long.class, java.lang.Long.class, "ORDER_ID", false, 3, -5));

      addMetadata(this.orderId, QColumnMetadataFactory.create("ORDER_ID", 3, -5, false));
    }

    book:
    {
      this.book =
          this.<pl.exsio.querydsl.entityql.config.entity.JBook>createForeignKey(
              this.bookId, "BOOK_ID");
    }

    order:
    {
      this.order =
          this.<pl.exsio.querydsl.entityql.config.entity.JOrder>createForeignKey(
              this.orderId, "ORDER_ID");
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.id);

      this._primaryKey =
          this.<pl.exsio.querydsl.entityql.config.entity.JOrderItem>createPrimaryKey(
              paths.<Path>toArray(new Path[0]));
    }
  }
}
