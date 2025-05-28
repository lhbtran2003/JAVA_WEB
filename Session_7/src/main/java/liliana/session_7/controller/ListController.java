package liliana.session_7.controller;

import liliana.session_7.model.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListController {
    public List<Product> getProductList () {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1L, "Honda Vision", 32000.0, 10,
                "Xe tay ga nhỏ gọn, tiết kiệm xăng",
                "https://example.com/images/honda-vision.jpg"));

        products.add(new Product(2L, "Yamaha Exciter", 45000.0, 7,
                "Xe số thể thao mạnh mẽ",
                "https://example.com/images/yamaha-exciter.jpg"));

        products.add(new Product(3L, "Suzuki Raider", 42000.0, 5,
                "Xe côn tay tốc độ cao",
                "https://example.com/images/suzuki-raider.jpg"));

        products.add(new Product(4L, "Honda SH Mode", 60000.0, 3,
                "Xe tay ga cao cấp sang trọng",
                "https://example.com/images/honda-sh-mode.jpg"));

        products.add(new Product(5L, "VinFast Klara", 25000.0, 8,
                "Xe máy điện thân thiện môi trường",
                "https://example.com/images/vinfast-klara.jpg"));

        return products;
    }

    @GetMapping("/get-list-product")
    public String showProductList (Model model) {
        model.addAttribute("products", getProductList());
        return "ex6/product_list";
    }

    @PostMapping("/get-product-detail")
    public String showProductDetail (Model model, @RequestParam Long id) {
         List<Product> products = getProductList();
         Product product = products.stream().filter(p -> p.getId() == id).findFirst().get();
         model.addAttribute("product", product);
         return "ex6/product_details";
    }
}
