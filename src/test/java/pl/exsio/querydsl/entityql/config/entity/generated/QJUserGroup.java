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
public final class QJUserGroup
    extends QStaticModel<pl.exsio.querydsl.entityql.config.entity.JUserGroup> {

  public static final QJUserGroup INSTANCE = new QJUserGroup();

  public final NumberPath<java.lang.Long> groupId;

  public final NumberPath<java.lang.Long> userId;

  public final ForeignKey<pl.exsio.querydsl.entityql.config.entity.JGroup> group;

  public final ForeignKey<pl.exsio.querydsl.entityql.config.entity.JUser> user;

  public final PrimaryKey<pl.exsio.querydsl.entityql.config.entity.JUserGroup> _primaryKey;

  public QJUserGroup() {
    this("JUSERS_GROUPS");
  }

  @SuppressWarnings(value = "unchecked")
  public QJUserGroup(String variable) {
    super(pl.exsio.querydsl.entityql.config.entity.JUserGroup.class, variable, "", "JUSERS_GROUPS");

    groupId:
    {
      this.groupId =
          QPathFactory.<NumberPath<java.lang.Long>>create(
              this,
              new QPathConfig(java.lang.Long.class, java.lang.Long.class, "GROUP_ID", true, 3, -5));

      addMetadata(this.groupId, QColumnMetadataFactory.create("GROUP_ID", 3, -5, true));
    }

    userId:
    {
      this.userId =
          QPathFactory.<NumberPath<java.lang.Long>>create(
              this,
              new QPathConfig(java.lang.Long.class, java.lang.Long.class, "USER_ID", true, 4, -5));

      addMetadata(this.userId, QColumnMetadataFactory.create("USER_ID", 4, -5, true));
    }

    group:
    {
      this.group =
          this.<pl.exsio.querydsl.entityql.config.entity.JGroup>createForeignKey(
              this.groupId, "GROUP_ID");
    }

    user:
    {
      this.user =
          this.<pl.exsio.querydsl.entityql.config.entity.JUser>createForeignKey(
              this.userId, "USER_ID");
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.groupId);

      paths.add(this.userId);

      this._primaryKey =
          this.<pl.exsio.querydsl.entityql.config.entity.JUserGroup>createPrimaryKey(
              paths.<Path>toArray(new Path[0]));
    }
  }
}
