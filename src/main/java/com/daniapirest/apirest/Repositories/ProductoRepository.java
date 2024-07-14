package com.daniapirest.apirest.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.daniapirest.apirest.Entities.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
