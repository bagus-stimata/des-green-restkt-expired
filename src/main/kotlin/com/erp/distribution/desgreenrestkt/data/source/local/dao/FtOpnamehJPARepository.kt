package com.erp.distribution.desgreenrestkt.data.source.local.dao

import com.erp.distribution.desgreenrestkt.data.source.entity.FtOpnameh
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface FtOpnamehJPARepository : JpaRepository<FtOpnameh, Long> {
    fun findByRefno(refno: Long): FtOpnameh
    fun findByNoRek(noRek: String): List<FtOpnameh>

    @Query("SELECT u FROM FtOpnameh u WHERE u.noRek LIKE :noRek ")
    fun findAll(noRek: String): List<FtOpnameh>

    @Query("SELECT u FROM FtOpnameh u WHERE u.fdivisionBean = :fdivisionBean")
    fun findAllByDivision(fdivisionBean: Int): List<FtOpnameh>
}