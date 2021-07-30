package cs544.exercise15_1;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class BillingServiceImpl implements BillingService {

	@Scheduled(cron = "0/7 * * * * *")
	public void printBills() {
		System.out.println(getTime() + "    printing bills");
	}

	@Scheduled(cron = "0/10 * * * * *")
	public void generateBillingReport() {
		System.out.println(getTime() + "    Generate billing reports");
	}

	public String getTime() {
		Date date = Calendar.getInstance().getTime();
		DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);
		String currenttime = timeFormatter.format(date);
		return currenttime;
	}

}
