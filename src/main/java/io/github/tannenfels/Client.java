package io.github.tannenfels;

import io.github.tannenfels.configs.Settings;
import io.github.tannenfels.service.*;

public class Client {

   private final LeadService leadService = new LeadService();
   private final CompanyService companyService = new CompanyService();
   private final ContactService contactService = new ContactService();
   private final ProductSectionService productSectionService = new ProductSectionService();
   private final ProductService productService = new ProductService();
   private final ChatService chatService = new ChatService();

    public Client(String token, String account, Integer rest_ID) {
        Settings.token = token;
        Settings.account = account;
        Settings.restID = rest_ID;
    }

    public ContactService contactService() {
        return contactService;
    }

    public LeadService leadService() {
        return leadService;
    }

    public CompanyService companyService() {
        return companyService;
    }

    public ProductSectionService productSectionService() {
        return productSectionService;
    }

    public ProductService productService() {
        return productService;
    }

    public ChatService chatService() {
        return chatService;
    }
}
