package io.github.tannenfels.examples.company;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Company;
import io.github.tannenfels.entity.model.Email;
import io.github.tannenfels.entity.model.Website;
import io.github.tannenfels.entity.types.CompanyType;
import io.github.tannenfels.entity.types.EmailType;
import io.github.tannenfels.entity.types.WebsiteType;

import java.util.ArrayList;
import java.util.List;

/**
 * UpdateCompany.
 *
 * @author javastream
 */
public class UpdateCompany {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        // Get by Id
        Company company = client.companyService().get(2);

        // Set data
        company.setBankingDetails("r/s 40702810865698252");
        company.setCompanyType(CompanyType.SUPPLIER.getCode());
        company.setAddress("Olympic Boulevard Apt. 120");
        company.setComments("Interested in price");

        // Set emails
        List<Email> listEmail = new ArrayList<>();
        Email email = Email.builder()
                .value("srtur12@gmail.com").valueType(EmailType.PRIVATE.getCode()).build();
        listEmail.add(email);
        company.setEmails(listEmail);
        client.companyService().update(company);

        // Set websites
        Website website = company.getWebsites().get(0);
        website.setValue("www.albert12.org");
        website.setValueType(WebsiteType.OTHER.getCode());
        List<Website> websitList = new ArrayList<>();
        websitList.add(website);
        company.setWebsites(websitList);

        client.companyService().update(company);
    }
}
