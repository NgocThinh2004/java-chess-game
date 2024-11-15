package network.packets;

import java.util.ArrayList;

public class GeneralPackets {
    public static class LoginRequest {
        public String userName;
        public String passwd;
        
        public LoginRequest(){

        }
        
        public LoginRequest(String userName, String passwd) {
            this.userName = userName;
            this.passwd = passwd;
        }  
    }
    
    public static class LoginResponse {
        public int userId;
        public String userName;
        public String passwd;
        public int elo;
        public int win;
        public int lose;
        public int draw;
    }

    public static class RegisterRequest {
        public String fullName;
        public String userName;
        public String passwd;

        public RegisterRequest(){

        }

        public RegisterRequest(String fullName, String userName, String passwd) {
            this.fullName = fullName;
            this.userName = userName;
            this.passwd = passwd;
        }
        
    }

    public static class RegisterResponse {
        public boolean isSuccess;
        public String message;
    }

    public static class ErrorResponse {
        public String error;
    }
    
    public static class HistoryGameRequest {
        public String gameId;
        public HistoryGameRequest(){

        }

        public HistoryGameRequest(String gameId) {
            this.gameId = gameId;
        }
    }

    public static class HistoryGameResponse {
        public int playerId;
        public int opponentId;
        public String moves;
        public String result;

        public HistoryGameResponse(){}
        public HistoryGameResponse(int playerId, int opponentId, String moves, String result) {
            this.playerId = playerId;
            this.opponentId = opponentId;
            this.moves = moves;
            this.result = result;
        }
    }

    public static class RankingListRequest {
        public String option;

        public RankingListRequest(){

        }

        public RankingListRequest(String option) {
            this.option = option;
        }
        
    }

    public static class RankingListResponse {
        public ArrayList<UserRank> rankingList;
        class UserRank{
            public String userName;
            public int elo;

            public UserRank(String userName, int elo){
                this.userName = userName;
                this.elo = elo;
            }
        }

        public void addUserRankToList(String userName, int elo){
            rankingList.add(new UserRank(userName, elo));
        }
    }

    public static class ProfileViewRequest{
        public int userId;
        public ProfileViewRequest(){

        }

        public ProfileViewRequest(int userId) {
            this.userId = userId;
        }
        
    }
    
    public static class ProfileViewResponse{
        public String userName;
        public int elo;
        public int win;
        public int lose;
        public int draw;
    }

    public static class MsgPacket {
        public String msg;
        public MsgPacket(){

        }
        public MsgPacket(String msg) {
            this.msg = msg;
        }
        
    }


    public static class FindGameRequest{
        public String userId;
        public int elo;
        public FindGameRequest(){

        }
        public FindGameRequest(String userId, int elo) {
            this.userId = userId;
            this.elo = elo;
        }
        
    }

    public static class FindGameResponse{
        public int tcpPort;
        public int udpPort;
    }

}