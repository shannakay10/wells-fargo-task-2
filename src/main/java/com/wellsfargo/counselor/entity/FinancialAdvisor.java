import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Other instance variables or relationships related to FinancialAdvisor

    public FinancialAdvisor() {
        // Default constructor for JPA
    }

    public FinancialAdvisor(String name /* Other parameters */) {
        this.name = name;
        // Initialize other instance variables
    }

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    // No setId() method to make id read-only

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Other Getter and Setter methods for additional instance variables or relationships
}

@Entity
class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Other instance variables or relationships related to Client

    public Client() {
        // Default constructor for JPA
    }

    public Client(String name /* Other parameters */) {
        this.name = name;
        // Initialize other instance variables
    }

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    // No setId() method to make id read-only

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Other Getter and Setter methods for additional instance variables or relationships
}

@Entity
class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Other instance variables or relationships related to Portfolio

    public Portfolio() {
        // Default constructor for JPA
    }

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    // No setId() method to make id read-only

    // Other Getter and Setter methods for additional instance variables or relationships
}

@Entity
class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private String purchaseDate;
    private double purchasePrice;
    private int quantity;

    // Other instance variables or relationships related to Security

    public Security() {
        // Default constructor for JPA
    }

    public Security(String name, String category, String purchaseDate, double purchasePrice, int quantity /* Other parameters */) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        // Initialize other instance variables
    }

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    // No setId() method to make id read-only

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Other Getter and Setter methods for additional instance variables or relationships
}
