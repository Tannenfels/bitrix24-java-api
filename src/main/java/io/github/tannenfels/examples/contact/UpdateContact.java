package io.github.tannenfels.examples.contact;

import io.github.tannenfels.Client;
import io.github.tannenfels.configs.Configs;
import io.github.tannenfels.entity.Contact;
import io.github.tannenfels.entity.model.Phone;
import io.github.tannenfels.entity.types.PhoneType;

import java.util.ArrayList;
import java.util.List;

/**
 * UpdateContact.
 *
 * @author javastream
 */
public class UpdateContact {

    public static void main(String[] args) {
        Client client = new Client(
                Configs.token,
                Configs.account,
                Configs.restId
        );

        Contact contact = client.contactService().get(2);

        contact.setCompanyId("2");
        contact.setName("Джон");

        // set new phones
        List<Phone> listPhone = new ArrayList<>();
        Phone phone = Phone.builder()
                .value("601-00-00").valueType(PhoneType.MOBILE.getCode()).build();
        listPhone.add(phone);
        contact.setPhones(listPhone);
        client.contactService().update(contact);

        // change existing phone
        Phone phone2 = contact.getPhones().get(0);
        phone2.setValue("222-22-22");
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(phone2);
        contact.setPhones(phoneList);
        client.contactService().update(contact);
    }
}