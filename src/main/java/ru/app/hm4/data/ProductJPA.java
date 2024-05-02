package ru.app.hm4.data;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.app.hm4.model.Product;

public interface ProductJPA extends JpaRepository<Product,Integer> {

}
