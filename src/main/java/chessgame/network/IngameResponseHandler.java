package chessgame.network;


import chessgame.network.packets.GeneralPackets.MsgPacket;
import chessgame.network.packets.IngamePackets.*;

public interface IngameResponseHandler {
    public void handleMovePacket(MovePacket movePacket);
    public void handleGamestateUpdate(GameStateResponse gameStateResponse);
    public void handleGameEnd(GameEndResponse gameEndResponse);
    public void onReciveOpponentInfo(OpponentInfo opponentInfo);
    public void handleMsgPacket(MsgPacket response);
}
