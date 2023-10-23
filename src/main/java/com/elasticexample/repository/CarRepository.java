package com.elasticexample.repository;

import com.elasticexample.model.CarModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CarRepository extends ElasticsearchRepository<CarModel, String> {

    List<CarModel> findAllByBrand(String brand);
}
