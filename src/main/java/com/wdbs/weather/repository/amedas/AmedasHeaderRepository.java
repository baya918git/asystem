package com.wdbs.weather.repository.amedas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wdbs.weather.model.amedas.AmedasHeader;

/**
 * アメダスヘッダーリポジトリクラス。
 */
public interface AmedasHeaderRepository extends JpaRepository<AmedasHeader, Long> {
}
