package com.xeiam.xchange.kraken.dto.trade.results;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xeiam.xchange.kraken.dto.KrakenResult;
import com.xeiam.xchange.kraken.dto.trade.KrakenTrade;
import com.xeiam.xchange.kraken.dto.trade.results.KrakenTradeHistoryResult.KrakenTradeHistory;


public class KrakenTradeHistoryResult extends KrakenResult<KrakenTradeHistory> {

  public KrakenTradeHistoryResult(@JsonProperty("result") KrakenTradeHistory result, @JsonProperty("error") String[] error) {

    super(result, error);
  }
  
  public static class KrakenTradeHistory {

    private final Map<String, KrakenTrade> orders;
    private final int count;
    
    public KrakenTradeHistory(@JsonProperty("trades") Map<String, KrakenTrade> orders, @JsonProperty("count") int count) {

      this.orders = orders;
      this.count = count;
    }

    public Map<String, KrakenTrade> getOrders() {

      return orders;
    }

    public int getCount() {

      return count;
    }
  }
}
