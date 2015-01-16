package org.huntingtonrobotics.frcrecyclerushpitscouter;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.UUID;


/**
 * Created by 2015H_000 on 1/5/2015.
 */
public class Team {

    private static final String JSON_ID = "id";
    private static final String JSON_TEAM_NUM = "teamNum";
    private static final String JSON_PHOTO = "photo";

    //mech
    private static final String JSON_MECH_LITTER_INSERTER = "mechLitterInserter";
    private static final String JSON_MECH_LITTER_PUSHER = "mechLitterPusher";

    private static final String JSON_MECH_TOTE_FEEDER = "mechToteFeeder";

    private static final String JSON_MECH_CONTAINER_FLIPPER = "mechContainerFlipper";
    private static final String JSON_MECH_CONTAINER_STEP_REMOVER = "mechContainerStepRemover";

    //auto
    private static final String JSON_AUTO_PROGS = "autoProgs";
    private static final String JSON_AUTO_MOVE = "autoMove";
    private static final String JSON_AUTO_TOTES = "autoTotes";
    private static final String JSON_AUTO_CONTAINERS = "autoContainers";
    //private static final String JSON_AUTO_HEIGHT = "autoHeight";      //deleted from auto
    private static final String JSON_AUTO_MOVE_TOTE = "autoMoveTote";
    private static final String JSON_AUTO_POS = "autoPos";

    //tele
    private static final String JSON_TELE_STACK_TOTES = "teleStackTotes";
    private static final String JSON_TELE_STACK_CONTAINERS = "teleStackContainers";
    private static final String JSON_TELE_PLACE_LITTER = "telePlaceLitter";
    private static final String JSON_TELE_PLACE_TOTE ="telePlaceTote";
    private static final String JSON_TELE_CARRY_TOTE = "teleCarryTote";
    private static final String JSON_TELE_COOP_SET = "teleCoopSet";
    private static final String JSON_TELE_COOP_STACK = "teleCoopStack";
    private static final String JSON_TELE_STACK_DIRECTION = "teleStackDirection";
    private static final String JSON_TELE_PLATFORM = "telePlatform";
    private static final String JSON_TELE_HUMAN_STATION="teleHumanStation";
    private static final String JSON_TELE_PICK_UP_LITTER = "telePickUpLitter";
    private static final String JSON_TELE_MOVE_LITTER="teleMoveLitter";


    private UUID mID;

    //team info
    private int mTeamNum;
    private Photo mPhoto;

    //mech
    private boolean mMechLitterInserter;
    private boolean mMechLitterPusher;

    private boolean mMechToteFeeder;

    private boolean mMechContainerFlipper;
    private boolean mMechContainerStepRemover;

    //auto
    private int mAutoProgs;
    private boolean mAutoMove;
    private int mAutoTotes;
    private int mAutoContainers;
    //private int mAutoHeight;  //deleted from auto
    private boolean mAutoMoveTote;
    private int mAutoPos;

    //tele
    private int mTeleTotes;
    private int mTeleContainer;
    private int mTelePlaceLitter;
    private int mTelePlaceTotes;
    private int mTeleCarryTotes;
    private int mTeleCoopSet;
    private int mTeleCoopStack;

    private int mTeleStackingDirection;
    private int mTelePlatform;
    private int mTeleHumanStation;

    private boolean mTelePickUpLitter;
    private boolean mTeleMoveLitter;

    //Constructor for Team
    public Team(){
        //generate unique identifier
        mID = UUID.randomUUID();
    }
    //---Constructor for Team

    //constructor that accepts JSON object
    public Team(JSONObject json) throws JSONException{
        mID = UUID.fromString(json.getString(JSON_ID));
        if (json.has(JSON_TEAM_NUM)){
            mTeamNum = json.getInt(JSON_TEAM_NUM);
        }
        if (json.has(JSON_PHOTO)){
            mPhoto = new Photo(json.getJSONObject(JSON_PHOTO));
        }

        //mech
        if(json.has(JSON_MECH_LITTER_INSERTER)){
            mMechLitterInserter = json.getBoolean(JSON_MECH_LITTER_INSERTER);
        }
        if(json.has(JSON_MECH_LITTER_PUSHER)){
            mMechLitterPusher = json.getBoolean(JSON_MECH_LITTER_PUSHER);
        }

        if(json.has(JSON_MECH_TOTE_FEEDER)){
            mMechToteFeeder = json.getBoolean(JSON_MECH_TOTE_FEEDER);
        }

        if(json.has(JSON_MECH_CONTAINER_FLIPPER)){
            mMechContainerFlipper = json.getBoolean(JSON_MECH_CONTAINER_FLIPPER);
        }
        if(json.has(JSON_MECH_CONTAINER_STEP_REMOVER)){
            mMechContainerStepRemover = json.getBoolean(JSON_MECH_CONTAINER_STEP_REMOVER);
        }

        //auto
        if (json.has(JSON_AUTO_PROGS)){
            mAutoProgs = json.getInt(JSON_AUTO_PROGS);
        }
        if (json.has(JSON_AUTO_MOVE)){
            mAutoMove = json.getBoolean(JSON_AUTO_MOVE);
        }
        if (json.has(JSON_AUTO_TOTES)){
            mAutoTotes = json.getInt(JSON_AUTO_TOTES);
        }
        if (json.has(JSON_AUTO_CONTAINERS)){
            mAutoContainers = json.getInt(JSON_AUTO_CONTAINERS);
        }
        /*deleted from auto
        if (json.has(JSON_AUTO_HEIGHT)){
            mAutoHeight = json.getInt(JSON_AUTO_HEIGHT);
        }
        */
        if (json.has(JSON_AUTO_MOVE_TOTE)){
            mAutoMoveTote = json.getBoolean(JSON_AUTO_MOVE_TOTE);
        }
        if (json.has(JSON_AUTO_POS)){
            mAutoPos = json.getInt(JSON_AUTO_POS);
        }

        //tele
        if (json.has(JSON_TELE_STACK_TOTES)){
            mTeleTotes = json.getInt(JSON_TELE_STACK_TOTES);
        }
        if (json.has(JSON_TELE_STACK_CONTAINERS)){
            mTeleContainer = json.getInt(JSON_TELE_STACK_CONTAINERS);
        }
        if (json.has(JSON_TELE_PLACE_LITTER)){
            mTelePlaceLitter = json.getInt(JSON_TELE_PLACE_LITTER);
        }
        if (json.has(JSON_TELE_PLACE_TOTE)){
            mTelePlaceTotes = json.getInt(JSON_TELE_PLACE_TOTE);
        }
        if (json.has(JSON_TELE_CARRY_TOTE)){
            mTeleCarryTotes = json.getInt(JSON_TELE_CARRY_TOTE);
        }
        if (json.has(JSON_TELE_COOP_SET)){
            mTeleCoopSet = json.getInt(JSON_TELE_COOP_SET);
        }
        if (json.has(JSON_TELE_COOP_STACK)){
            mTeleCoopStack = json.getInt(JSON_TELE_COOP_STACK);
        }

        if (json.has(JSON_TELE_STACK_DIRECTION)){
            mTeleStackingDirection = json.getInt(JSON_TELE_STACK_DIRECTION);
        }
        if (json.has(JSON_TELE_PLATFORM)){
            mTelePlatform = json.getInt(JSON_TELE_PLATFORM);
        }
        if (json.has(JSON_TELE_HUMAN_STATION)){
            mTeleHumanStation = json.getInt(JSON_TELE_HUMAN_STATION);
        }

        if (json.has(JSON_TELE_PICK_UP_LITTER)){
            mTelePickUpLitter = json.getBoolean(JSON_TELE_PICK_UP_LITTER);
        }
        if (json.has(JSON_TELE_MOVE_LITTER)){
            mTeleMoveLitter = json.getBoolean(JSON_TELE_MOVE_LITTER);
        }

    }
    //---constructor that accepts JSON object

    //puts teams to JSON format to be put in JSON file
    public JSONObject toJSON() throws JSONException{
        JSONObject json = new JSONObject();
        json.put(JSON_ID, mID.toString());
        json.put(JSON_TEAM_NUM, mTeamNum);
        if (mPhoto!=null){
            json.put(JSON_PHOTO, mPhoto.toJSON());
        }

        //mech
        json.put(JSON_MECH_LITTER_INSERTER, mMechLitterInserter);
        json.put(JSON_MECH_LITTER_PUSHER, mMechLitterPusher);

        json.put(JSON_MECH_TOTE_FEEDER, mMechToteFeeder);

        json.put(JSON_MECH_CONTAINER_FLIPPER, mMechContainerFlipper);
        json.put(JSON_MECH_CONTAINER_STEP_REMOVER, mMechContainerStepRemover);

        //auto
        json.put(JSON_AUTO_PROGS, mAutoProgs);
        json.put(JSON_AUTO_MOVE, mAutoMove);
        json.put(JSON_AUTO_TOTES, mAutoTotes);
        json.put(JSON_AUTO_CONTAINERS, mAutoContainers);
        //json.put(JSON_AUTO_HEIGHT, mAutoHeight);      //deleted from auto
        json.put(JSON_AUTO_MOVE_TOTE, mAutoMoveTote);
        json.put(JSON_AUTO_POS, mAutoPos);

        //tele
        json.put(JSON_TELE_STACK_TOTES, mTeleTotes);
        json.put(JSON_TELE_STACK_CONTAINERS, mTeleContainer);
        json.put(JSON_TELE_PLACE_LITTER, mTelePlaceLitter);
        json.put(JSON_TELE_PLACE_TOTE, mTelePlaceTotes);
        json.put(JSON_TELE_CARRY_TOTE, mTeleCarryTotes);
        json.put(JSON_TELE_COOP_SET, mTeleCoopSet);
        json.put(JSON_TELE_COOP_STACK, mTeleCoopStack);

        json.put(JSON_TELE_STACK_DIRECTION, mTeleStackingDirection);
        json.put(JSON_TELE_PLATFORM, mTelePlatform);
        json.put(JSON_TELE_HUMAN_STATION, mTeleHumanStation);

        json.put(JSON_TELE_PICK_UP_LITTER, mTelePickUpLitter);
        json.put(JSON_TELE_MOVE_LITTER, mTeleMoveLitter);

        return json;
    }
    //---puts teams to JSON format to be put in JSON file

    @Override
    public String toString() {
        return "Team #" + mTeamNum;
    }

    //Getter and Setter for mID
    public UUID getID() {
        return mID;
    }
    public void setID(UUID ID) {
        mID = ID;
    }
    //---Getter and Setter for mID

    //Getter and Setter for mTeamNum
    public int getTeamNum() {
        return mTeamNum;
    }
    public void setTeamNum(int teamNum) {
        mTeamNum = teamNum;
    }
    //---Getter and Setter for mTeamNum


    //Getter and Setter for mPhoto
    public Photo getPhoto() {
        return mPhoto;
    }
    public void setPhoto(Photo p) {
        this.mPhoto = p;
    }
    //---Getter and Setter for mPhoto


    //Getter and Setters for Mech
    public boolean isMechLitterInserter() {
        return mMechLitterInserter;
    }

    public void setMechLitterInserter(boolean li) {
        this.mMechLitterInserter = li;
    }

    public boolean isMechLitterPusher() {
        return mMechLitterPusher;
    }

    public void setMechLitterPusher(boolean lp) {
        this.mMechLitterPusher = lp;
    }

    public boolean isMechToteFeeder() {
        return mMechToteFeeder;
    }

    public void setMechToteFeeder(boolean tf) {
        this.mMechToteFeeder = tf;
    }

    public boolean isMechContainerFlipper() {
        return mMechContainerFlipper;
    }

    public void setMechContainerFlipper(boolean cf) {
        this.mMechContainerFlipper = cf;
    }

    public boolean isMechContainerStepRemover() {
        return mMechContainerStepRemover;
    }

    public void setMechContainerStepRemover(boolean sr) {
        this.mMechContainerStepRemover = sr;
    }

    //---Getter and Setters for Mech


    //Getter and Setters for Auto

    public int getAutoProgs() {
        return mAutoProgs;
    }

    public void setAutoProgs(int ap) {
        this.mAutoProgs = ap;
    }

    public boolean isAutoMove() {
        return mAutoMove;
    }

    public void setAutoMove(boolean am) {
        this.mAutoMove = am;
    }

    public int getAutoTotes() {
        return mAutoTotes;
    }

    public void setAutoTotes(int at) {
        this.mAutoTotes = at;
    }

    public int getAutoContainers() {
        return mAutoContainers;
    }

    public void setAutoContainers(int ac) {
        this.mAutoContainers = ac;
    }

    /*deleted from auto
    public int getAutoHeight() {
        return mAutoHeight;
    }

    public void setAutoHeight(int ah) {
        this.mAutoHeight = ah;
    }
    */

    public boolean isAutoMoveTote() {
        return mAutoMoveTote;
    }

    public void setAutoMoveTote(boolean mt) {
        this.mAutoMoveTote = mt;
    }

    public int getAutoPos() {
        return mAutoPos;
    }

    public void setAutoPos(int ap) {
        this.mAutoPos = ap;
    }

    //----Getter and Setters for Auto


    //Getter and Setters for Tele

    public int getTeleTotes() {
        return mTeleTotes;
    }

    public void setTeleTotes(int tt) {
        this.mTeleTotes = tt;
    }

    public int getTeleContainer() {
        return mTeleContainer;
    }

    public void setTeleContainer(int tc) {
        this.mTeleContainer = tc;
    }

    public int getTelePlaceLitter() {
        return mTelePlaceLitter;
    }

    public void setTelePlaceLitter(int pl) {
        this.mTelePlaceLitter = pl;
    }

    public int getTelePlaceTotes() {
        return mTelePlaceTotes;
    }

    public void setTelePlaceTotes(int pt) {
        this.mTelePlaceTotes = pt;
    }

    public int getTeleCarryTotes() {
        return mTeleCarryTotes;
    }

    public void setTeleCarryTotes(int ct) {
        this.mTeleCarryTotes = ct;
    }

    public int getTeleCoopSet() {
        return mTeleCoopSet;
    }

    public void setTeleCoopSet(int cs) {
        this.mTeleCoopSet = cs;
    }

    public int getTeleCoopStack() {
        return mTeleCoopStack;
    }

    public void setTeleCoopStack(int cs) {
        this.mTeleCoopStack = cs;
    }

    public int getTeleStackingDirection() {
        return mTeleStackingDirection;
    }

    public void setTeleStackingDirection(int sd) {
        this.mTeleStackingDirection = sd;
    }

    public int getTelePlatform() {
        return mTelePlatform;
    }

    public void setTelePlatform(int tp) {
        this.mTelePlatform = tp;
    }

    public int getTeleHumanStation() {
        return mTeleHumanStation;
    }

    public void setTeleHumanStation(int hs) {
        this.mTeleHumanStation = hs;
    }

    public boolean isTelePickUpLitter() {
        return mTelePickUpLitter;
    }

    public void setTelePickUpLitter(Boolean pl) {
        this.mTelePickUpLitter = pl;
    }

    public boolean isTeleMoveLitter() {
        return mTeleMoveLitter;
    }

    public void setTeleMoveLitter(Boolean ml) {
        this.mTeleMoveLitter = ml;
    }


    //---Getter and Setters for Tele


    //for bubble sort
    public int compareTo(Team t){
        int res=0;
        if (mTeamNum < t.getTeamNum()) {res=-1;  }
        if (mTeamNum > t.getTeamNum()){res=1;}
        return res;
    }
}
