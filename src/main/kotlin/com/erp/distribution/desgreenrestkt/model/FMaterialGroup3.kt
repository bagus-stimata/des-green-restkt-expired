package com.erp.distribution.desgreenrestkt.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement
import java.util.*
import javax.persistence.*

@JacksonXmlRootElement
@Entity
@Table(name = "fmaterial_group3")
class FMaterialGroup3 {
    @Id
    @Column(name = "ID", length = 9)
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id = 0

    /*
	 * JIKA COPY DARI TEMPAT LAIN: MAKA SEBAGAI LOG TRACK MENINGGALKAN SOURCE_ID = ID sumber asal dia dicopy
	 * keperluan diantaranya:
	 * 1. Clone Database. karena tidak mungkin menggunakan Kode External yang bisa jadi kemungkinan kembar, tapi harus pakai kode internal
	 * 2. 
	 */
    @Column(name = "SOURCE_ID", length = 9)
    var sourceId = 0

    @Column(name = "KODE1", length = 10)
    var kode1 = ""

    @Column(name = "KODE2", length = 20)
    var kode2 = ""

    @Column(name = "DESCRIPTION", length = 100)
    var description = ""

    @Transient
    var tempInt1 = 0

    @Transient
    var tempInt2 = 0

    @Transient
    var tempInt3 = 0

    //	@ManyToOne
    //	@JoinColumn(name="fmaterialGroup2Bean", referencedColumnName="ID")
    //	private FMaterialGroup2 fmaterialGroup2Bean;
    @Column(name = "fmaterialGroup2Bean", nullable = false)
    var fmaterialGroup2Bean = 0

    @Column(name = "STATUS_ACTIVE")
    var isStatusActive = true

    @Column(name = "CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    var created = Date()

    @Column(name = "MODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
    var modified = Date()

    @Column(name = "MODIFIED_BY", length = 20)
    var modifiedBy = "" //User ID

}