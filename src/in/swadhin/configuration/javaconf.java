package in.swadhin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.student.*;
@Configuration
public class javaconf 
{
  @Bean
  public address address1()
  {
	  address ad=new address();
	  ad.setHouseno(987);
	  ad.setCity("hyd");
	  ad.setPin(763987);
	  return ad;
  }
  @Bean
  public address address2()
  {
	  address ad=new address();
	  ad.setHouseno(453);
	  ad.setCity("delhi");
	  ad.setPin(750106);
	  return ad;
  }
  @Bean
  public college_details college()
  {
	  college_details cd= new college_details();
	  cd.setName("Sidhartha");
	  cd.setRollno(859);
	  return cd;
  }
}
