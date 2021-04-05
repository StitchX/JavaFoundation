package com.jphy.lottery.testcase.API.asynBet;

import com.jphy.lottery.APIHelper.BetAsynHelper;
import com.jphy.lottery.plugins.father.BetOrderFather;
import com.jphy.lottery.util.JdbcUtil;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import java.util.List;

/**
 * @author Lance
 * @Description K3投注接口测试
 */
public class Bet_Asyn_003_K3_Test {
    public static Logger logger = Logger.getLogger(Bet_Asyn_003_K3_Test.class.getName());

    @Test(invocationCount = 1)
    public void orderBetting(ITestContext context) {
        final String filePath = "./src/test/resources/data/K3BetDatas.xml";
        final int lotteryType = 8;
        BetOrderFather.initHttpClient();
        List<String> numbers = JdbcUtil.queryNumbers(lotteryType);
        BetAsynHelper betAsynHelper = new BetAsynHelper(context, filePath, String.valueOf(lotteryType));
        for (int j = 0; j < numbers.size(); j++) {
            betAsynHelper.betLottery(BetOrderFather.httpClient,numbers.get(j));
        }
    }
}
