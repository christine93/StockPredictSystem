package com.ru.service;

import java.util.List;

import com.ru.entity.Hstock;

public interface HstockService {

	List<Hstock> searchStockByName(String stock);

}
