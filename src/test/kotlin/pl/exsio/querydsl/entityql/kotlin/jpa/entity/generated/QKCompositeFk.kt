 package pl.exsio.querydsl.entityql.kotlin.jpa.entity.generated

 import com.querydsl.sql.PrimaryKey
 import pl.exsio.querydsl.entityql.QColumnMetadataFactory
 import pl.exsio.querydsl.entityql.QPathConfig
 import pl.exsio.querydsl.entityql.QPathFactory
 import pl.exsio.querydsl.entityql.QStaticModel
 import com.querydsl.sql.ForeignKey
 import pl.exsio.querydsl.entityql.kotlin.jpa.entity.KCompositeFk
 import com.querydsl.core.types.dsl.NumberPath
 import com.querydsl.core.types.dsl.StringPath
 import pl.exsio.querydsl.entityql.kotlin.jpa.entity.KCompositePk
 import pl.exsio.querydsl.entityql.kotlin.jpa.entity.KSingularPk
 import javax.annotation.Generated
 import com.querydsl.core.types.Path
 

 /**
 *
 * This class was generated by EntityQL (https://github.com/eXsio/querydsl-entityql).
 * It is not recommended to make any changes to this class.
 * Any manual changes will be lost upon the next class generation.
 *
 */
 @Generated("pl.exsio.querydsl.entityql.QExporter")
 class QKCompositeFk : QStaticModel<KCompositeFk> {

     companion object {
         val instance: QKCompositeFk = QKCompositeFk()
         val qKCompositeFk: QKCompositeFk = QKCompositeFk.instance
     }

     val id: NumberPath<Long> = run {
         val config = QPathConfig(Long::class.java, Long::class.java, "ID", true, 1, -5)
         val id = QPathFactory.create<NumberPath<Long>>(this, config)
         addMetadata(id, QColumnMetadataFactory.create(config))
         this.columnsMap.put("id", id)
         id
     }

     val desc: StringPath = run {
         val config = QPathConfig(String::class.java, String::class.java, "DESC", true, 4, 12)
         val desc = QPathFactory.create<StringPath>(this, config)
         addMetadata(desc, QColumnMetadataFactory.create(config))
         this.columnsMap.put("desc", desc)
         desc
     }

     val compositePk: ForeignKey<KCompositePk> = run {
         val config0 = QPathConfig(Long::class.java, Long::class.java, "CPK_ID_1", false, 2, -5)
         val compositePk0 = QPathFactory.create<Path<*>>(this, config0)
         addMetadata(compositePk0, QColumnMetadataFactory.create(config0))
         val config1 = QPathConfig(String::class.java, String::class.java, "CPK_ID_2", false, 2, 12)
         val compositePk1 = QPathFactory.create<Path<*>>(this, config1)
         addMetadata(compositePk1, QColumnMetadataFactory.create(config1))
         val compositePk = this.createForeignKey<KCompositePk>(listOf(compositePk0, compositePk1), listOf("ID_1", "ID_2"))
         this.joinColumnsMap.put("compositePk", compositePk)
         compositePk
     }

     val singularPk: ForeignKey<KSingularPk> = run {
         val config0 = QPathConfig(Long::class.java, Long::class.java, "SPK_ID_1", false, 3, -5)
         val singularPk0 = QPathFactory.create<Path<*>>(this, config0)
         addMetadata(singularPk0, QColumnMetadataFactory.create(config0))
         val config1 = QPathConfig(String::class.java, String::class.java, "SPK_ID_2", false, 3, 12)
         val singularPk1 = QPathFactory.create<Path<*>>(this, config1)
         addMetadata(singularPk1, QColumnMetadataFactory.create(config1))
         val singularPk = this.createForeignKey<KSingularPk>(listOf(singularPk0, singularPk1), listOf("ID_1", "ID_2"))
         this.joinColumnsMap.put("singularPk", singularPk)
         singularPk
     }

     val _primaryKey: PrimaryKey<KCompositeFk> = run {
         val list = mutableListOf<Path<*>>(this.id)
         this.primaryKeyColumns = list
         this.createPrimaryKey(*list.toTypedArray())
     }

     constructor(): this("COMPOSITE_FK")

     constructor(variable: String): super(KCompositeFk::class.java, variable, "", "COMPOSITE_FK")
 } 