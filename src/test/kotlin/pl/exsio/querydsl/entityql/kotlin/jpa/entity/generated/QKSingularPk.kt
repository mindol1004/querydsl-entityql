package pl.exsio.querydsl.entityql.kotlin.jpa.entity.generated

import com.querydsl.core.dml.StoreClause
import com.querydsl.core.types.Path
import com.querydsl.core.types.dsl.NumberPath
import com.querydsl.core.types.dsl.StringPath
import com.querydsl.sql.ForeignKey
import com.querydsl.sql.PrimaryKey
import java.util.ArrayList
import java.util.Arrays
import javax.annotation.Generated
import pl.exsio.querydsl.entityql.QColumnMetadataFactory
import pl.exsio.querydsl.entityql.QPathConfig
import pl.exsio.querydsl.entityql.QPathFactory
import pl.exsio.querydsl.entityql.QStaticModel
import pl.exsio.querydsl.entityql.kotlin.jpa.entity.KCompositeFk
import pl.exsio.querydsl.entityql.kotlin.jpa.entity.KSingularPk

/**
 *
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql). It is not
 * recommended to make any changes to this class. Any manual changes will be lost upon the next
 * class generation.
 */
@Generated("pl.exsio.querydsl.entityql.QExporter")
class QKSingularPk : QStaticModel<KSingularPk> {

  companion object {
    val instance: QKSingularPk = QKSingularPk()
    val qKSingularPk: QKSingularPk = QKSingularPk.instance
  }

  val id1: NumberPath<Long> =
      run {
        val config = QPathConfig(Long::class.java, Long::class.java, "ID_1", true, 1, -5)

        val id1 = QPathFactory.create<NumberPath<Long>>(this, config)

        addMetadata(id1, QColumnMetadataFactory.create(config))
        this.columnsMap.put("id1", id1)
        id1
      }

  val id2: StringPath =
      run {
        val config = QPathConfig(String::class.java, String::class.java, "ID_2", true, 2, 12)

        val id2 = QPathFactory.create<StringPath>(this, config)

        addMetadata(id2, QColumnMetadataFactory.create(config))
        this.columnsMap.put("id2", id2)
        id2
      }

  val desc: StringPath =
      run {
        val config = QPathConfig(String::class.java, String::class.java, "DESC", true, 3, 12)

        val desc = QPathFactory.create<StringPath>(this, config)

        addMetadata(desc, QColumnMetadataFactory.create(config))
        this.columnsMap.put("desc", desc)
        desc
      }

  val compositeFks: ForeignKey<KCompositeFk> =
      run {
        val config0 = QPathConfig(Long::class.java, Long::class.java, "ID_1", false, 4, -5)

        val compositeFks0 = QPathFactory.create<Path<*>>(this, config0)
        addMetadata(compositeFks0, QColumnMetadataFactory.create(config0))

        val config1 = QPathConfig(String::class.java, String::class.java, "ID_2", false, 4, 12)

        val compositeFks1 = QPathFactory.create<Path<*>>(this, config1)
        addMetadata(compositeFks1, QColumnMetadataFactory.create(config1))

        val compositeFks =
            this.createInvForeignKey<KCompositeFk>(
                listOf(compositeFks0, compositeFks1), listOf("SPK_ID_1", "SPK_ID_2"))

        this.inverseJoinColumnsMap.put("compositeFks", compositeFks)
        compositeFks
      }

  val _primaryKey: PrimaryKey<KSingularPk> =
      run {
        val list = mutableListOf<Path<*>>(this.id1)

        this.primaryKeyColumns = list
        this.createPrimaryKey(*list.toTypedArray())
      }

  constructor() : this("SINGULAR_PK")

  constructor(variable: String) : super(KSingularPk::class.java, variable, "", "SINGULAR_PK")
}
