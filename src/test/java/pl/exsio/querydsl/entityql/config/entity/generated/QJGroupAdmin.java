package pl.exsio.querydsl.entityql.config.entity.generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;
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
public final class QJGroupAdmin
    extends QStaticModel<pl.exsio.querydsl.entityql.config.entity.JGroupAdmin> {

  public static final QJGroupAdmin INSTANCE = new QJGroupAdmin();

  public final NumberPath<java.lang.Long> id;

  public final StringPath name;

  public final PrimaryKey<pl.exsio.querydsl.entityql.config.entity.JGroupAdmin> _primaryKey;

  public QJGroupAdmin() {
    this("JGROUP_ADMINS");
  }

  @SuppressWarnings(value = "unchecked")
  public QJGroupAdmin(String variable) {
    super(
        pl.exsio.querydsl.entityql.config.entity.JGroupAdmin.class, variable, "", "JGROUP_ADMINS");

    id:
    {
      this.id =
          QPathFactory.<NumberPath<java.lang.Long>>create(
              this,
              new QPathConfig(java.lang.Long.class, java.lang.Long.class, "GA_ID", true, 1, -5));

      addMetadata(this.id, QColumnMetadataFactory.create("GA_ID", 1, -5, true));
    }

    name:
    {
      this.name =
          QPathFactory.<StringPath>create(
              this,
              new QPathConfig(java.lang.String.class, java.lang.String.class, "NAME", true, 2, 12));

      addMetadata(this.name, QColumnMetadataFactory.create("NAME", 2, 12, true));
    }

    _primaryKey:
    {
      List<Path> paths = new ArrayList();

      paths.add(this.id);

      this._primaryKey =
          this.<pl.exsio.querydsl.entityql.config.entity.JGroupAdmin>createPrimaryKey(
              paths.<Path>toArray(new Path[0]));
    }
  }
}
