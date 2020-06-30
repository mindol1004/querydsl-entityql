package pl.exsio.querydsl.entityql.java.jpa.entity.generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.sql.ForeignKey;
import com.querydsl.sql.PrimaryKey;
import java.util.Arrays;
import javax.annotation.Generated;
import pl.exsio.querydsl.entityql.QColumnMetadataFactory;
import pl.exsio.querydsl.entityql.QPathConfig;
import pl.exsio.querydsl.entityql.QPathFactory;
import pl.exsio.querydsl.entityql.QStaticModel;
import pl.exsio.querydsl.entityql.java.jpa.entity.JOrder;
import pl.exsio.querydsl.entityql.java.jpa.entity.JOrderItem;
import pl.exsio.querydsl.entityql.java.jpa.entity.JUser;

/**
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@Generated("pl.exsio.querydsl.entityql.QExporter")
public final class QJOrder extends QStaticModel<JOrder> {

  private static final long serialVersionUID = 1021087534;

  public static final QJOrder INSTANCE = new QJOrder();

  public static final QJOrder qJOrder = INSTANCE;

  public final NumberPath<Long> id;

  public final NumberPath<Long> userId;

  public final ForeignKey<JUser> user;

  public final ForeignKey<JOrderItem> items;

  public final ForeignKey<JOrderItem> itemsReferenced;

  public final PrimaryKey<JOrder> _primaryKey;

  public QJOrder() {
    this("JORDERS");
  }

  @SuppressWarnings(value = "unchecked")
  public QJOrder(String variable) {
    super(JOrder.class, variable, "", "JORDERS");

    id:
    {
      QPathConfig config = new QPathConfig(Long.class, Long.class, "ORDER_ID", true, 1, -5);

      this.id = QPathFactory.<NumberPath<Long>>create(this, config);

      addMetadata(this.id, QColumnMetadataFactory.create(config));
      this.columnsMap.put("id", this.id);
    }

    userId:
    {
      QPathConfig config = new QPathConfig(Long.class, Long.class, "USER_ID", false, 2, -5);

      this.userId = QPathFactory.<NumberPath<Long>>create(this, config);

      addMetadata(this.userId, QColumnMetadataFactory.create(config));
      this.columnsMap.put("userId", this.userId);
    }

    user:
    {
      this.user = this.<JUser>createForeignKey(this.userId, "USER_ID");
      this.joinColumnsMap.put("user", this.user);
    }

    items:
    {
      QPathConfig config0 = new QPathConfig(Long.class, Long.class, "ORDER_ID", false, 3, -5);

      Path<?> items0 = QPathFactory.<Path>create(this, config0);
      addMetadata(items0, QColumnMetadataFactory.create(config0));

      this.items =
          this.<JOrderItem>createInvForeignKey(
              Arrays.<Path<?>>asList(items0), Arrays.asList("ITEM_ORDER_ID"));

      this.inverseJoinColumnsMap.put("items", this.items);
    }

    itemsReferenced:
    {
      QPathConfig config0 = new QPathConfig(Long.class, Long.class, "ORDER_ID", false, 4, -5);

      Path<?> itemsReferenced0 = QPathFactory.<Path>create(this, config0);
      addMetadata(itemsReferenced0, QColumnMetadataFactory.create(config0));

      this.itemsReferenced =
          this.<JOrderItem>createInvForeignKey(
              Arrays.<Path<?>>asList(itemsReferenced0), Arrays.asList("ITEM_ORDER_ID"));

      this.inverseJoinColumnsMap.put("itemsReferenced", this.itemsReferenced);
    }

    _primaryKey:
    {
      this.primaryKeyColumns = Arrays.<Path<?>>asList(this.id);

      Path[] pkArray = (Path[]) primaryKeyColumns.<Path>toArray(new Path[0]);
      this._primaryKey = this.<JOrder>createPrimaryKey(pkArray);
    }
  }
}