package com.erp.distribution.desgreenrestkt.jpa_repository

import com.erp.distribution.desgreenrestkt.model.FtSalesdPromoTprb
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface FtSalesdPromoTprbJPARepository : JpaRepository<FtSalesdPromoTprb, Long> {
//    override fun findById(id: Long): FtSalesdPromoTprb
    fun findByNoUrut(noUrut: String): List<FtSalesdPromoTprb>

    @Query("SELECT u FROM FtSalesdPromoTprb u WHERE u.noUrut LIKE :noUrut")
    fun findAll(noUrut: String): List<FtSalesdPromoTprb>

    @Query("SELECT u FROM FtSalesdPromoTprb u WHERE u.ftSalesdFreegood = :ftSalesdFreegood")
    fun findAllByParentId(ftSalesdFreegood: Long): List<FtSalesdPromoTprb>
}