package com.plcoding.stockmarketapp.data.mapper

import com.plcoding.stockmarketapp.data.remote.dto.IntraDayInfoDTO
import com.plcoding.stockmarketapp.domain.model.IntradayInfo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun IntraDayInfoDTO.toIntradayInfo(): IntradayInfo {

    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime = LocalDateTime.parse(timestamp, formatter)

    return IntradayInfo(
        date = localDateTime,
        close = close
    )

}