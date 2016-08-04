// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.rest.Twilio;
import com.twilio.rest.resource.ResourceSet;
import com.twilio.rest.resource.api.v2010.account.IncomingPhoneNumber;
import com.twilio.rest.type.PhoneNumber;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    ResourceSet<IncomingPhoneNumber> numbers =
        IncomingPhoneNumber.read().byPhoneNumber(new PhoneNumber("867")).execute();

    // Loop over numbers and print out a property for each one.
    for (IncomingPhoneNumber number : numbers) {
      System.out.println(number.getVoiceUrl());
    }
  }
}