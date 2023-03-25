package kodlama.io.ecommerce.repository.abstracts;

import kodlama.io.ecommerce.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    //List<Product> getAll();
    //Product getById(int id);
    //Product add(Product product);
    //Product update(int id,Product product);
   // void delete(int id);

}
