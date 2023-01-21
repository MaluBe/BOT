import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived (Update update){
        //System.out.println(update.getMessage().getText());
       // System.out.println(update.getMessage().getFrom().getFirstName());
        String command= update.getMessage().getText();
        if (command.equals("/hello")) {
            String message="hello there";

          SendMessage response= new SendMessage();
           response.setChatId(update.getMessage().getChatId().toString());
           response.setText(message);
           try{
               execute(response);
           } catch (TelegramApiException e) {
               e.printStackTrace();
           }
        }
    }
        @Override
        public String getBotUsername () {
            return "Mbbbb12bot";
        }
        @Override
        public String getBotToken () {
            return "5939727719:AAEz4V9XxbLxBHS-vITht8Tu5ufYwmeCZ-o";
        }



    }

