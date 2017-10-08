import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.sf.json.JSONObject;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by 王玉粮 on 2017/6/28.
 */
public class TestJson
{
//    private int age;
//    private String name;
//
//    public String show()
//    {
//        return new String("name:" + name + "/age:" + age);
//    }

    public static void main(String[] args)
    {
//        String[] source =new String[]{
//                "",
//                "abc",
//                "{}",
//                "{\"nick_name\":\"Jack\"}",
//                "{\"name\":\"Anna\",\"id\":5}",
//                "{\"name\":\"Pluto\",\"age\":15,\"id\":10}"
//        };
//
//        Gson g=new Gson();
//        TestJson x=null;
//        StringBuffer info=null;
//        for(int i=0;i<source.length;i++)
//        {
//            info=new StringBuffer();
//            info.append(i).append(":").append(source[i]).append("\n\t");
//            try
//            {
//                x=g.fromJson(source[i], TestJson.class);
//                info.append((x == null) ? "NULL" : x.show());
//            }catch(Exception e)
//            {
//                info.append(e.getClass().getName());
//            }
//            System.out.println(info.toString());
//        }

//        String jsonStr = "{\"weight\":51.3,\"name\":\"露西\",\"age\":26,\"gender\":\"female\",\"grades\":\"三班\"}";


        String jsonStr = "{'code':'name'}";
        jsonStr = jsonStr.replaceAll("\'","\"");
        System.out.println(jsonStr);
        Map<String,Object> map = new HashMap<>();
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);

        Iterator<String> keys = jsonObject.keys();
        String key = null;
        Object value = null;
        while (keys.hasNext()){
            key = keys.next();
            value = jsonObject.get(key);
            map.put(key,value);
        }

        String templateContent = "{";
        Iterator<Map.Entry<String,Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Object> entry = iterator.next();
            templateContent += ""+entry.getKey()+":"+""+entry.getValue()+",";
            if(!iterator.hasNext()){
                templateContent += "}";
            }
        }
        System.out.println(templateContent);
//        System.out.println(map.get("weight"));
//        System.out.println(map.get("name"));
//        System.out.println(map.get("age"));
//        System.out.println(map.get("gender"));
//        System.out.println(map.get("grades"));

    }
}
