

import org.json.JSONArray;
import org.json.JSONObject;

    public class Parse {
        static String json = "{\n" +
                "    \"pageInfo\": {\n" +
                "            \"pageName\": \"Homepage\",\n" +
                "            \"logo\": \"https://www.example.com/logo.jpg\"\n" +
                "    },\n" +
                "    \"posts\": [\n" +
                "            {\n" +
                "                \"post_id\": \"0123454321\",\n" +
                "                \"actor_id\": \"1001\",\n" +
                "                \"author_name\": \"Sergio Mendez\",\n" +
                "                \"post_title\": \"How to parse JSON in Java\",\n" +
                "                \"comments\": [{\"comment\": \"Aprobado\"}],\n" +
                "                \"time_of_post\": \"0987656789\"\n" +
                "            },\n" +
                "    ]\n" +

                "}";

        public static void main(String[] args) {
            JSONObject obj = new JSONObject(json);
            String pageName = obj.getJSONObject("pageInfo").getString("pageName");

            System.out.println(pageName);

            JSONArray array = obj.getJSONArray("posts");
            for (int i = 0; i < array.length(); i++) {
                String post_id = array.getJSONObject(i).getString("post_id");
                System.out.println(post_id);
                JSONArray array2 = array.getJSONObject(i).getJSONArray("comments");
                for (int j = 0; j < array2.length(); j++) {
                    String comentarios = array2.getJSONObject(j).getString("comment");
                    System.out.println(comentarios);
                }
            }
        }
    }






