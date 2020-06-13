import java.util.List;

public class SILab2 {

    public boolean function (User user, List<String> allUsers) {
        if (user!=null) { //A
            if (user.getUsername()!=null && user.getEmail()!=null && !allUsers.contains(user.getUsername())) { //C
                 boolean atChar = false, dotChar = false;//C
                for (int i=0;i<user.getEmail().length();i++) {//C
                    if (user.getEmail().charAt(i)=='@') //D
                        atChar = true;//D
                    if (atChar && user.getEmail().charAt(i)=='.') { //E
                        dotChar = true;//E
                    }
                }
                if (atChar && dotChar) { //G
                    return true; //G
                }
            }
        }
        return false; //B
    }
}
