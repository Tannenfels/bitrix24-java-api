package io.github.tannenfels.examples.chat;

import io.github.tannenfels.Client;
import io.github.tannenfels.entity.Chat;
import io.github.tannenfels.entity.Lead;
import io.github.tannenfels.entity.model.chat.User;
import io.github.tannenfels.entity.types.ChatColorType;
import io.github.tannenfels.examples.Example;

import java.util.List;

/**
 * ChatOperation.
 *
 * @author javastream
 */
public class ChatOperation extends Example {

    public static void main(String[] args) {
        Client client = boot();

        Lead lead = client.leadService().get(2);
        Chat chat = client.chatService().get(lead);
        List<User> userList = client.chatService().getUsers(chat);

        Chat chatNew = new Chat();
        chatNew.setColor(ChatColorType.AZURE.getCode());
        chatNew.setDescription("Conversation with a client #40");
        chatNew.setMessage("Hello customer #40!");
        chatNew.setTitle("Customer " + lead.getTitle());
        client.chatService().createChat(chatNew, lead, userList);
    }
}