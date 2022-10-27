class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String email : emails){
            int split_pos = email.indexOf('@');
            String local_name = email.substring(0,split_pos);
            String Domain_name = email.substring(split_pos);
            if(local_name.contains("+")){
                int plus_position = local_name.indexOf('+');
                local_name = local_name.substring(0,plus_position);
                
            }
            local_name = local_name.replaceAll("\\.","");
            String ok = local_name + Domain_name;
            set.add(ok);
        }
        return set.size();
    }
}