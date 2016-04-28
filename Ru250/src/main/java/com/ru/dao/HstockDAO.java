package com.ru.dao;

import java.util.List;

import com.ru.entity.Hstock;

public interface HstockDAO {

	public List<Hstock> searchStockByName(String stock);

	public List<Hstock> getHighestTen(String stock);

}
