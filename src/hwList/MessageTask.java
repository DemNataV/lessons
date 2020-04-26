package hwList;

import java.util.*;

public class MessageTask {
   // List<Message> messages = MessageGenerator.generate(34);

    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        System.out.println("Задание 1");
        for (MessagePriority priority :
                MessagePriority.values()) {
            int n = 0;
            for (Message massage : messageList) {

                if (massage.getPriority().equals(priority)) {
                    n++;
                }
            }
            System.out.println(priority + " " + n);
        }
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        System.out.println("Задание 2");
        for (int i = 0; i < 10; i++) {
            int n = 0;
            for (Message massage : messageList) {

                if (massage.getCode()==i) {
                    n++;
                }
            }
            System.out.println("code = " + i + " у " + n + " сообщений");
        }
    }

    private static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        System.out.println("Задание 3");
        Set<Message> setMessage=new LinkedHashSet<>(messageList);
        System.out.println(setMessage.size());
    }

    public static Set<Message> uniqueMessagesInOriginalOrder(List<Message> messageList){
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        System.out.println("Задание 4");
        Set<Message> setMessage=new LinkedHashSet<>(messageList);
        return setMessage;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println("Задание 5");
        System.out.println(messageList);
//        messageList.removeIf(x -> x.getPriority().equals(priority));

        Iterator<Message> messageIterator = messageList.iterator();
        while (messageIterator.hasNext()) {
            Message nextmessage = messageIterator.next();
            if (nextmessage.getPriority().equals(priority)) {
                messageIterator.remove();
            }
        }
        System.out.println(messageList);
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println("Задание 6");
        System.out.println(messageList);
//        messageList.removeIf(x -> !x.getPriority().equals(priority));

        Iterator<Message> messageIterator = messageList.iterator();
        while (messageIterator.hasNext()) {
            Message nextmessage = messageIterator.next();
            if (!nextmessage.getPriority().equals(priority)) {
                messageIterator.remove();
            }
        }
        System.out.println(messageList);
    }

    public static void main(String[] args) {
        List<Message> messages = MessageGenerator.generate(34);
        System.out.println(messages);
        countEachPriority(messages);
        countEachCode(messages);
        uniqueMessageCount(messages);
        System.out.println(uniqueMessagesInOriginalOrder(messages));
        removeEach(messages, MessagePriority.LOW);
        removeOther(messages, MessagePriority.MEDIUM);
        // вызов методов
    }
}
