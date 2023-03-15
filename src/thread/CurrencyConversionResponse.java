/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Administrator
 */
public class CurrencyConversionResponse {
    private String Base;
    private String date;
    private Map<String, String> rates = new TreeMap<>();
    private String base;
    
  public Map<String, String> getRtaes() {
      return rates;
  }
  public void setRates(Map<String, String> rates) {
      this.rates = rates;
  }
  public String getBase() {
      return base;
  }
  public void setBase(String base) {
      this.Base = base;
  }
  public String getDate() {
      return date;
  }
  
}
