
public class dataset{
    int a;
    String username[]=new String[50];
    String password[]=new String[50];
    String trains[]=new String[10];
    String trainName[]=new String[10];
    String trainTime[]=new String[10];
    String trainNumber[]=new String[10];
    boolean check(String s1,String s2, String key)
    {
        username[0]="AkritiRinge";
        username[1]="KunalSingh";
        username[2]="RishabhSahay";       
        password[0]="abcd";
        password[1]="abcde";
        password[2]="abcdef";
        //if(key=="pass")
            //return(search(password,s,password.length));
        if(key=="user")
        {
            a=search(username,s1,username.length);
            return(search(a,password,s2));
        }
        return false;
    }
    int search(String ar[],String s,int n)
    {
        for (int i=0;i<n;i++)
        {
            if(s.equals(ar[i]))
            return i;
        }
        return -1;
    }
    boolean search(int pos,String ar[],String s)
    {
        if (pos!=-1 && s.equals(ar[pos]))
            return true;
        return false;
    }
    void database()
    {
        trainName[0]="Punjab Mail";
        trainName[1]="Shatabdi Express";
        trainName[2]="Gareeb Rath";
        trainNumber[0]="6123";
        trainNumber[1]="2137";
        trainNumber[2]="2137";
        trainTime[0]="17:20";
        trainTime[1]="07:10";
        trainTime[2]="03:40";
        trainName[3]="Janshatabdi";
        trainName[4]="Durranto";
        trainName[5]="Chennai Express"; 
        trainName[6]="Delhi Express";
        trainName[7]="Goa Express";
        trainName[8]="Mumbai Express";
         trainNumber[3]="6100";
        trainNumber[4]="2138";
        trainNumber[5]="1900"; trainNumber[6]="9090";
        trainNumber[7]="3201";
        trainNumber[8]="8018"; 
        trainTime[3]="7:20";
        trainTime[4]="10:10";
        trainTime[5]="09:40";  trainTime[6]="19:20";
        trainTime[7]="15:10";
        trainTime[8]="06:40";
          trainTime[9]="06:15"; trainName[9]="Bengaluru Express";      trainNumber[9]="1567";
    }
    void main(String str1,String str2,String str3){
        check(str1,str2,str3);
    }
}
