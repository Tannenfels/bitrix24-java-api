package io.github.tannenfels.examples.lead;

import io.github.tannenfels.Client;
import io.github.tannenfels.entity.Lead;
import io.github.tannenfels.entity.model.Phone;
import io.github.tannenfels.entity.types.PhoneType;
import io.github.tannenfels.entity.types.SourceIdType;
import io.github.tannenfels.examples.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * AddNewLead.
 *
 * @author javastream
 */
public class AddNewLead extends Example {

    public static void main(String[] args) {
        Client client = boot();

        Lead lead = new Lead();

        lead.setTitle("Test2");
        lead.setSourceId(SourceIdType.ADVERTISING.getCode());
        lead.setAddress("England, Rosenberg str, 100");

        Phone phone = Phone.builder()
                .value("79310225686").valueType(PhoneType.HOME.getCode()).build();
        List<Phone> listPhones = new ArrayList<>();
        listPhones.add(phone);
        lead.setOpportunity("0");
        lead.setPhones(listPhones);

        client.leadService().add(lead);
        System.out.println(lead.getId());
    }
}