package com.erp.distribution.desgreenrestkt.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement
import java.io.Serializable
import java.util.*
import javax.persistence.*

@JacksonXmlRootElement
@Entity
@Table(name = "ftarpaymenth")
class FtArPaymenth : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REFNO")
    var refno: Long = 0

    /*
	 * JIKA COPY DARI TEMPAT LAIN: MAKA SEBAGAI LOG TRACK MENINGGALKAN SOURCE_ID = ID sumber asal dia dicopy
	 * keperluan diantaranya:
	 * 1. Clone Database. karena tidak mungkin menggunakan Kode External yang bisa jadi kemungkinan kembar, tapi harus pakai kode internal
	 * 2. 
	 */
    @Column(name = "SOURCE_ID")
    var sourceId: Long = 0

    @Column(name = "NO_REK", length = 15)
    var noRek = ""

    @Column(name = "TR_DATE")
    @Temporal(TemporalType.DATE)
    var trDate = Date()

    @Column(name = "ENTRY_DATE")
    @Temporal(TemporalType.DATE)
    var entryDate = Date()

    @Column(name = "NOTES", length = 150)
    var notes = ""

    @Column(name = "PRINT_COUNTER", length = 4)
    var printCounter = 0

    //PENGGUNAAN UTAMA PADA END_OF_DAY
    @Column(name = "END_OF_DAY")
    var isEndOfDay = false

    //	@ManyToOne
    //	@JoinColumn(name="fdivisionBean", referencedColumnName="ID")
    //	private FDivision fdivisionBean;
    @Column(name = "fdivisionBean", nullable = false)
    var fdivisionBean = 0

    /*
	 * Dipakai untuk Settlemen dengan AR vs Kasir
	 */
    //	@ManyToOne
    //	@JoinColumn(name="payeeBean", referencedColumnName="ID", nullable=true)
    //	private FSalesman payeeBean;
    @Column(name = "payeeBean")
    var payeeBean = 0

    @Column(name = "CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    var created = Date()

    @Column(name = "MODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
    var modified = Date()

    @Column(name = "MODIFIED_BY", length = 20)
    var modifiedBy = "" //User ID

}