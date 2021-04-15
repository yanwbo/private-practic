package yifeng;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;
import java.util.stream.Stream;

/**
 * 天江物流信息
 */
public class ZYExpressInfo {

    public static void main(String[] args) {
        new ZYExpressInfo().format();
    }

    @Data
    static class Express {
        String express_cop;
        String express_num;
        String note_id;
        String express_murl;
        String express_url;
        String note_flag;
        String note_status;
        String pat_name;
        String pat_num;
        String status_datetime;

        @Override
        public String toString() {
            return String.format("%s %s %s", note_id, express_cop, express_num);
        }
    }

    private void format() {
        ObjectMapper om = new ObjectMapper();
        String txt = "{\"express_cop\":\"顺丰\",\"express_num\":\"322093426567\",\"note_id\":\"201131848263364047\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322090592234\",\"express_num\":\"322090592234\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322090592234\",\"note_flag\":\"终止\",\"note_id\":\"201122030542555857\",\"note_status\":\"外包\",\"pat_name\":\"顾绍杨\",\"pat_num\":\"204751365\",\"status_datetime\":\"2020-04-22 10:50:23\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322094052527\",\"express_num\":\"322094052527\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322094052527\",\"note_flag\":\"终止\",\"note_id\":\"201121916490757865\",\"note_status\":\"外包\",\"pat_name\":\"袁勋\",\"pat_num\":\"204521866\",\"status_datetime\":\"2020-04-23 10:31:38\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322090644366\",\"express_num\":\"322090644366\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322090644366\",\"note_flag\":\"终止\",\"note_id\":\"201131009489196346\",\"note_status\":\"外包\",\"pat_name\":\"温玉晗\",\"pat_num\":\"200043101\",\"status_datetime\":\"2020-04-22 10:58:30\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322093440104\",\"express_num\":\"322093440104\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322093440104\",\"note_flag\":\"终止\",\"note_id\":\"201131717351147182\",\"note_status\":\"外包\",\"pat_name\":\"杨\",\"pat_num\":\"6675528\",\"status_datetime\":\"2020-04-23 09:03:20\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322094016077\",\"express_num\":\"322094016077\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322094016077\",\"note_flag\":\"终止\",\"note_id\":\"201140919105905877\",\"note_status\":\"外包\",\"pat_name\":\"杨潜\",\"pat_num\":\"204760552\",\"status_datetime\":\"2020-04-23 10:24:20\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322090637630\",\"express_num\":\"322090637630\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322090637630\",\"note_flag\":\"终止\",\"note_id\":\"201130928257199154\",\"note_status\":\"外包\",\"pat_name\":\"陈莹\",\"pat_num\":\"202589722\",\"status_datetime\":\"2020-04-22 10:57:56\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322093807451\",\"express_num\":\"322093807451\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322093807451\",\"note_flag\":\"终止\",\"note_id\":\"201140826019469489\",\"note_status\":\"外包\",\"pat_name\":\"马钟源\",\"pat_num\":\"202464251\",\"status_datetime\":\"2020-04-23 09:55:04\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322091572265\",\"express_num\":\"322091572265\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322091572265\",\"note_flag\":\"终止\",\"note_id\":\"201131420483046252\",\"note_status\":\"外包\",\"pat_name\":\"陈光鑫\",\"pat_num\":\"203942075\",\"status_datetime\":\"2020-04-22 14:48:03\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322094099652\",\"express_num\":\"322094099652\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322094099652\",\"note_flag\":\"终止\",\"note_id\":\"201132218367445428\",\"note_status\":\"外包\",\"pat_name\":\"陈强\",\"pat_num\":\"203828877\",\"status_datetime\":\"2020-04-23 10:42:36\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322093843144\",\"express_num\":\"322093843144\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322093843144\",\"note_flag\":\"终止\",\"note_id\":\"201140844309479400\",\"note_status\":\"外包\",\"pat_name\":\"吴易衡\",\"pat_num\":\"204426657\",\"status_datetime\":\"2020-04-23 10:00:53\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322093383125\",\"express_num\":\"322093383125\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322093383125\",\"note_flag\":\"终止\",\"note_id\":\"201131842016416266\",\"note_status\":\"外包\",\"pat_name\":\"毛玲\",\"pat_num\":\"202134522\",\"status_datetime\":\"2020-04-23 08:55:50\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322090651416\",\"express_num\":\"322090651416\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322090651416\",\"note_flag\":\"终止\",\"note_id\":\"201122012160404047\",\"note_status\":\"外包\",\"pat_name\":\"李思妍\",\"pat_num\":\"9991357\",\"status_datetime\":\"2020-04-22 10:59:42\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322094056419\",\"express_num\":\"322094056419\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322094056419\",\"note_flag\":\"终止\",\"note_id\":\"201140917447782728\",\"note_status\":\"外包\",\"pat_name\":\"黄伊宸\",\"pat_num\":\"204695748\",\"status_datetime\":\"2020-04-23 10:32:20\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322090634327\",\"express_num\":\"322090634327\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322090634327\",\"note_flag\":\"终止\",\"note_id\":\"201131009489196346\",\"note_status\":\"外包\",\"pat_name\":\"温玉晗\",\"pat_num\":\"200043101\",\"status_datetime\":\"2020-04-22 10:56:58\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322093387150\",\"express_num\":\"322093387150\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322093387150\",\"note_flag\":\"终止\",\"note_id\":\"201131808247172707\",\"note_status\":\"外包\",\"pat_name\":\"王玉\",\"pat_num\":\"204756542\",\"status_datetime\":\"2020-04-23 08:56:24\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322091879760\",\"express_num\":\"322091879760\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322091879760\",\"note_flag\":\"终止\",\"note_id\":\"201131404355946884\",\"note_status\":\"外包\",\"pat_name\":\"唐蓓\",\"pat_num\":\"200120199\",\"status_datetime\":\"2020-04-22 16:01:30\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322094103197\",\"express_num\":\"322094103197\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322094103197\",\"note_flag\":\"终止\",\"note_id\":\"201141015534719594\",\"note_status\":\"外包\",\"pat_name\":\"石康博\",\"pat_num\":\"204227107\",\"status_datetime\":\"2020-04-23 10:43:18\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322093421671\",\"express_num\":\"322093421671\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322093421671\",\"note_flag\":\"终止\",\"note_id\":\"201132151497024530\",\"note_status\":\"外包\",\"pat_name\":\"陈一星\",\"pat_num\":\"204179928\",\"status_datetime\":\"2020-04-23 08:59:57\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322091345853\",\"express_num\":\"322091345853\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322091345853\",\"note_flag\":\"终止\",\"note_id\":\"201131240296567559\",\"note_status\":\"外包\",\"pat_name\":\"田纯熙\",\"pat_num\":\"204755474\",\"status_datetime\":\"2020-04-22 14:02:50\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322090558056\",\"express_num\":\"322090558056\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322090558056\",\"note_flag\":\"终止\",\"note_id\":\"201122044302231465\",\"note_status\":\"外包\",\"pat_name\":\"王常梅\",\"pat_num\":\"201982700\",\"status_datetime\":\"2020-04-22 10:44:19\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322093432534\",\"express_num\":\"322093432534\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322093432534\",\"note_flag\":\"终止\",\"note_id\":\"201131928375698809\",\"note_status\":\"外包\",\"pat_name\":\"李亚\",\"pat_num\":\"10602228\",\"status_datetime\":\"2020-04-23 09:01:56\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322090606674\",\"express_num\":\"322090606674\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322090606674\",\"note_flag\":\"终止\",\"note_id\":\"201131009489196346\",\"note_status\":\"外包\",\"pat_name\":\"温玉晗\",\"pat_num\":\"200043101\",\"status_datetime\":\"2020-04-22 10:52:21\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322094029540\",\"express_num\":\"322094029540\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322094029540\",\"note_flag\":\"终止\",\"note_id\":\"201140856498562668\",\"note_status\":\"外包\",\"pat_name\":\"庞芳\",\"pat_num\":\"7885731\",\"status_datetime\":\"2020-04-23 10:27:37\"}###{\"express_cop\":\"顺丰\",\"express_murl\":\"http://www.sf-express.com/mobile/cn/sc/dynamic_function/waybill/waybill_query_info.html?billno=322092162903\",\"express_num\":\"322092162903\",\"express_url\":\"http://origin.sf-express.com/cn/sc/dynamic_functions/waybill/#search/bill-number/322092162903\",\"note_flag\":\"终止\",\"note_id\":\"201131643552837413\",\"note_status\":\"外包\",\"pat_name\":\"柏春菊\",\"pat_num\":\"204591551\",\"status_datetime\":\"2020-04-22 17:05:24\"}";
        List<Express> list = Lists.newArrayList();

        Stream.of(txt.split("###"))
                .filter(s -> s.contains("express_cop") && s.contains("express_num") && s.contains("note_id"))
                .forEach(s -> {
                    try {
                        list.add(om.readValue(s, Express.class));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
        System.out.println("获取物流信息" + list.size());
        list.forEach(System.out::println);
        ;
    }
}