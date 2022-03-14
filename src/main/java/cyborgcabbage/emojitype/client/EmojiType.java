package cyborgcabbage.emojitype.client;

import cyborgcabbage.emojitype.emoji.EmojiCode;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class EmojiType {
    public static final Logger LOGGER = LoggerFactory.getLogger("emojitype");
    public static ArrayList<EmojiCode> emojiCodes = new ArrayList<>() {
        {
                //Emojis
                add(new EmojiCode(":100:","💯"));
                add(new EmojiCode(":1234:","🔢"));
                add(new EmojiCode(":grinning:","😀"));
                add(new EmojiCode(":grimacing:","😬"));
                add(new EmojiCode(":grin:","😬"));
                add(new EmojiCode(":joy:","😂"));
                add(new EmojiCode(":rofl:","🤣"));
                add(new EmojiCode(":smiley:","😃"));
                add(new EmojiCode(":smile:","😄"));
                add(new EmojiCode(":sweat_smile:","😅"));
                add(new EmojiCode(":laughing:","😆"));
                add(new EmojiCode(":innocent:","😇"));
                add(new EmojiCode(":wink:","😉"));
                add(new EmojiCode(":blush:","😊"));
                add(new EmojiCode(":slight_smile:","🙂"));
                add(new EmojiCode(":upside_down:","🙃"));
                add(new EmojiCode(":relaxed:","☺"));
                add(new EmojiCode(":yum:","😋"));
                add(new EmojiCode(":relieved:","😌"));
                add(new EmojiCode(":heart_eyes:","😍"));
                add(new EmojiCode(":kissing_heart:","😘"));
                add(new EmojiCode(":kissing:","😗"));
                add(new EmojiCode(":kissing_smiling_eyess:","😙"));
                add(new EmojiCode(":kissing_closed_eyes:","😚"));
                add(new EmojiCode(":stuck_out_tongue_winking_eye:","😜"));
                add(new EmojiCode(":stuck_out_tongue_closed_eyes:","😝"));
                add(new EmojiCode(":stuck_out_tongue:","😛"));
                add(new EmojiCode(":money_mouth:","🤑"));
                add(new EmojiCode(":nerd:","🤓"));
                add(new EmojiCode(":sunglasses:","😎"));
                add(new EmojiCode(":smiling_imp:","😈"));
                add(new EmojiCode(":imp:","👿"));
                add(new EmojiCode(":hugging:","🤗"));
                add(new EmojiCode(":smirk:","😏"));
                add(new EmojiCode(":no_mouth:","😶"));
                add(new EmojiCode(":neutral_face:","😐"));
                add(new EmojiCode(":expressionless:","😑"));
                add(new EmojiCode(":unamused:","😒"));
                add(new EmojiCode(":rolling_eyes:","🙄"));
                add(new EmojiCode(":thinking:","🤔"));
                add(new EmojiCode(":lying_face:","🤥"));
                add(new EmojiCode(":flushed:","😳"));
                add(new EmojiCode(":disappointed:","😞"));
                add(new EmojiCode(":angry:","😠"));
                add(new EmojiCode(":rage:","😡"));
                add(new EmojiCode(":face_with_symbols_over_mouth:","🤬"));
                add(new EmojiCode(":pensive:","😔"));
                add(new EmojiCode(":confused:","😕"));
                add(new EmojiCode(":slight_frown:","🙁"));
                add(new EmojiCode(":frowning2:","☹️"));
                add(new EmojiCode(":persevere:","😣"));
                add(new EmojiCode(":confounded:","😖"));
                add(new EmojiCode(":weary:","😩"));
                add(new EmojiCode(":tired_face:","😫"));
                add(new EmojiCode(":triumph:","😤"));
                add(new EmojiCode(":open_mouth:","😮"));
                add(new EmojiCode(":scream:","😱"));
                add(new EmojiCode(":fearful:","😨"));
                add(new EmojiCode(":cold_sweat:","😰"));
                add(new EmojiCode(":hushed:","😯"));
                add(new EmojiCode(":frowning:","😦"));
                add(new EmojiCode(":anguished:","😧"));
                add(new EmojiCode(":cry:","😢"));
                add(new EmojiCode(":disappointed_relieved:","😥"));
                add(new EmojiCode(":drooling_face:","🤤"));
                add(new EmojiCode(":sleepy:","😪"));
                add(new EmojiCode(":sweat:","😓"));
                add(new EmojiCode(":sob:","😭"));
                add(new EmojiCode(":dizzy_face:","😵"));
                add(new EmojiCode(":astonished:","😲"));
                add(new EmojiCode(":zipper_mouth:","🤐"));
                add(new EmojiCode(":nauseated_face:","🤢"));
                add(new EmojiCode(":sneezing_face:","🤧"));
                add(new EmojiCode(":mask:","😷"));
                add(new EmojiCode(":thermometer_face:","🤒"));
                add(new EmojiCode(":head_bandage:","🤕"));
                add(new EmojiCode(":sleeping:","😴"));
                add(new EmojiCode(":star_struck:","🤩"));
                add(new EmojiCode(":face_with_monocle:","🧐"));
                add(new EmojiCode(":face_with_raised_eyebrow:","🤨"));
                add(new EmojiCode(":zany_face:","🤪"));
                add(new EmojiCode(":yawning_face:","🥱"));
                add(new EmojiCode(":face_with_hand_over_mouth:","🤭"));
                add(new EmojiCode(":exploding_head:","🤯"));
                add(new EmojiCode(":face_vomiting:","🤮"));
                add(new EmojiCode(":hot_face:","🥵"));
                add(new EmojiCode(":cold_face:","🥶"));
                add(new EmojiCode(":pleading_face:","🥺"));
                add(new EmojiCode(":poop:","💩"));
                add(new EmojiCode(":japanese_ogre:","👹"));
                add(new EmojiCode(":japanese_goblin:","👺"));
                add(new EmojiCode(":skulls:","💀"));
                add(new EmojiCode(":ghost:","👻"));
                add(new EmojiCode(":alien:","👽"));
                add(new EmojiCode(":robot:","🤖"));
                add(new EmojiCode(":broken_heart:","💔"));
                add(new EmojiCode(":heart:","♥️"));
                add(new EmojiCode(":orange_heart:","🧡"));
                add(new EmojiCode(":yellow_heart:","💛"));
                add(new EmojiCode(":green_heart:","💚"));
                add(new EmojiCode(":blue_heart:","💙"));
                add(new EmojiCode(":purple_heart:","💜"));
                add(new EmojiCode(":brown_heart:","🤎"));
                add(new EmojiCode(":white_heart:","🤍"));
                add(new EmojiCode(":black_heart:","🖤"));
                add(new EmojiCode(":heartpulse:","💗"));
                add(new EmojiCode(":heart_decoration:","💟"));
                add(new EmojiCode(":earth_americas:","🌎"));
                add(new EmojiCode(":earth_africa:","🌍"));
                add(new EmojiCode(":earth_asia:","🌏"));
                add(new EmojiCode(":globe_with_meridians:","🌐"));
                add(new EmojiCode(":thumbsup:","👍"));
                add(new EmojiCode(":thumbsdown:","👎"));
                add(new EmojiCode(":punch:","👊"));
                add(new EmojiCode(":fist:","✊"));
                add(new EmojiCode(":v:","✌"));
                add(new EmojiCode(":metal:","🤘"));
                add(new EmojiCode(":ok_hand:","👌"));
                add(new EmojiCode(":call_me:","🤙"));
                add(new EmojiCode(":middle_finger:","🖕"));
                add(new EmojiCode(":fuck_you:","🖕"));
                add(new EmojiCode(":raised_hand:","✋"));
                add(new EmojiCode(":raised__hand2:","🤚"));
                add(new EmojiCode(":raised_back_of_hand:","🤚"));
                add(new EmojiCode(":point_up:","☝️"));
                add(new EmojiCode(":point_up2:","👆"));
                add(new EmojiCode(":point_down:","👇"));
                add(new EmojiCode(":point_left:","👈"));
                add(new EmojiCode(":point_right:","👉"));
                add(new EmojiCode(":point:","☝️"));
                add(new EmojiCode(":point1:","👆"));
                add(new EmojiCode(":point2:","👇"));
                add(new EmojiCode(":point3:","👈"));
                add(new EmojiCode(":point4:","👉"));
                add(new EmojiCode(":raised_hands:","🙌"));
                add(new EmojiCode(":pray:","🙏"));
                add(new EmojiCode(":hello:","👋"));
                add(new EmojiCode(":hi:","👋"));
                add(new EmojiCode(":wave:","👋"));
                add(new EmojiCode(":clap:","👏"));
                add(new EmojiCode(":palms_up_together:","🤲"));
                add(new EmojiCode(":palms_up:","🤲"));
                add(new EmojiCode(":left_facing_fist:","🤛"));
                add(new EmojiCode(":fist:1","🤛"));
                add(new EmojiCode(":right_facing_fist:","🤜"));
                add(new EmojiCode(":fist2:","🤜"));
                add(new EmojiCode(":muscle:","💪"));
                add(new EmojiCode(":muscle2:","💁"));
                add(new EmojiCode(":writing_hand:","✍️"));
                add(new EmojiCode(":write:","✍️"));
                add(new EmojiCode(":ear:","👂"));
                add(new EmojiCode(":mouth:","👄"));
                add(new EmojiCode(":kiss:","💋"));
                add(new EmojiCode(":tongue:","👅"));
            //Face
            add(new EmojiCode(":happy:","☺"));
            add(new EmojiCode(":happy2:","☻"));
            add(new EmojiCode(":sad:","☹"));
            add(new EmojiCode(":skull:","☠"));
            //Tool
            add(new EmojiCode(":pickaxe:","⛏"));
            add(new EmojiCode(":axe:","\uD83E\uDE93"));
            add(new EmojiCode(":bucket:","\uD83E\uDEA3"));
            add(new EmojiCode(":shears:","✂"));
            add(new EmojiCode(":fishing:","\uD83C\uDFA3"));
            add(new EmojiCode(":umbrella:","☂"));
            //Combat
            add(new EmojiCode(":trident:","\uD83D\uDD31"));
            add(new EmojiCode(":sword:","\uD83D\uDDE1"));
            add(new EmojiCode(":shield:","\uD83D\uDEE1"));
            add(new EmojiCode(":duel:","⚔"));
            add(new EmojiCode(":bow:","\uD83C\uDFF9"));
            //Potion
            add(new EmojiCode(":potion:","\uD83E\uDDEA"));
            add(new EmojiCode(":splash:","⚗"));
            //Mark
            add(new EmojiCode(":copyright:","©"));
            add(new EmojiCode(":registered:","®"));
            add(new EmojiCode(":protected:","℗"));
            add(new EmojiCode(":trademark:","™"));
            add(new EmojiCode(":tm:","™"));
            //Water
            add(new EmojiCode(":anchor:","⚓"));
            add(new EmojiCode(":wave:","\uD83C\uDF0A"));
            add(new EmojiCode(":trademark:","™"));
            //Sex
            add(new EmojiCode(":male:","♂"));
            add(new EmojiCode(":female:","♀"));
            add(new EmojiCode(":intersex:","⚥"));
            //Direction
            add(new EmojiCode(":left:","⏴"));
            add(new EmojiCode(":right:","⏵"));
            add(new EmojiCode(":up:","⏶"));
            add(new EmojiCode(":down:","⏷"));
            add(new EmojiCode(":handleft:","☜"));
            add(new EmojiCode(":handright:","☞"));
            add(new EmojiCode(":swap:","⇄"));
            //Culture
            add(new EmojiCode(":yingyang:","☯"));
            add(new EmojiCode(":peace:","☮"));
            //Weather
            add(new EmojiCode(":sun:","☀"));
            add(new EmojiCode(":cloud:","☁"));
            add(new EmojiCode(":comet:","☄"));
            add(new EmojiCode(":moon:","☽"));
            add(new EmojiCode(":snowman:","⛄"));
            add(new EmojiCode(":storm:","⛈"));
            add(new EmojiCode(":snow:","❄"));
            //Control
            add(new EmojiCode(":eject:","⏏"));
            add(new EmojiCode(":fastforward:","⏩"));
            add(new EmojiCode(":fastbackward:","⏪"));
            add(new EmojiCode(":toend:","⏭"));
            add(new EmojiCode(":tostart:","⏮"));
            add(new EmojiCode(":playpause:","⏯"));
            add(new EmojiCode(":pause:","⏸"));
            add(new EmojiCode(":poweron:","⏻"));
            add(new EmojiCode(":poweroff:","⏼"));
            //Flag
            add(new EmojiCode(":whiteflag:","⚑"));
            add(new EmojiCode(":blackflag:","⚐"));
            //Boolean
            add(new EmojiCode(":box:","☐"));
            add(new EmojiCode(":yesbox:","☑"));
            add(new EmojiCode(":nobox:","☒"));
            add(new EmojiCode(":yes:","✔"));
            add(new EmojiCode(":no:","✘"));
            //Shape
            add(new EmojiCode(":square:","⏹"));
            add(new EmojiCode(":square2:","□"));
            add(new EmojiCode(":circle:","⏺"));
            add(new EmojiCode(":circle2:","○"));
            add(new EmojiCode(":cross:","❌"));
            add(new EmojiCode(":heart2:","❤"));
            add(new EmojiCode(":hearts:","❣"));
            add(new EmojiCode(":triangle:","▲"));
            add(new EmojiCode(":triangle2:","△"));
            add(new EmojiCode(":diamond:","◆"));
            add(new EmojiCode(":diamond2:","◇"));
            add(new EmojiCode(":loopedsquare:","⌘"));
            add(new EmojiCode(":target:","◎"));
            add(new EmojiCode(":star:","★"));
            add(new EmojiCode(":star2:","☆"));
            add(new EmojiCode(":star3:","⭐"));

            //Misc
            add(new EmojiCode(":fire:","\uD83D\uDD25"));
            add(new EmojiCode(":bell:","\uD83D\uDD14"));
            add(new EmojiCode(":hunger:","\uD83C\uDF56"));
            add(new EmojiCode(":unknown:","�"));
            add(new EmojiCode(":house:","⌂"));
            add(new EmojiCode(":clock:","⌚"));
            add(new EmojiCode(":warning:","⚠"));
            add(new EmojiCode(":electric:","⚡"));
            add(new EmojiCode(":mail:","✉"));
            add(new EmojiCode(":pencil:","✎"));
            add(new EmojiCode(":degree:","°"));
            add(new EmojiCode(":hourglass:","⌛"));
            add(new EmojiCode(":hourglass2:","⏳"));

            //Cards
            add(new EmojiCode(":suitspade:","♠"));
            add(new EmojiCode(":suitspade2:","♤"));
            add(new EmojiCode(":suitheart:","♥"));
            add(new EmojiCode(":suitheart2:","♡"));
            add(new EmojiCode(":suitclub:","♣"));
            add(new EmojiCode(":suitclub2:","♧"));
            add(new EmojiCode(":suitdiamond:","♦"));
            add(new EmojiCode(":suitdiamond2:","♢"));
            //Music
            add(new EmojiCode(":note1:","♩"));
            add(new EmojiCode(":note2:","♪"));
            add(new EmojiCode(":note3:","♫"));
            add(new EmojiCode(":note4:","♬"));
            add(new EmojiCode(":flat:","♭"));
            add(new EmojiCode(":sharp:","♮"));
            //Dice
            add(new EmojiCode(":dice1:","⚀"));
            add(new EmojiCode(":dice2:","⚁"));
            add(new EmojiCode(":dice3:","⚂"));
            add(new EmojiCode(":dice4:","⚃"));
            add(new EmojiCode(":dice5:","⚄"));
            add(new EmojiCode(":dice6:","⚅"));
            //Additional symbols
            //Shading
            add(new EmojiCode(":z0:","▀"));
            add(new EmojiCode(":z1:","▄"));
            add(new EmojiCode(":z2:","█"));
            add(new EmojiCode(":z3:","▌"));
            add(new EmojiCode(":z4:","▐"));
            add(new EmojiCode(":z5:","░"));
            add(new EmojiCode(":z6:","▒"));
            add(new EmojiCode(":z7:","▓"));
            //Lowercase Letters
            add(new EmojiCode(":za:","ⓐ"));
            add(new EmojiCode(":zb:","ⓑ"));
            add(new EmojiCode(":zc:","ⓒ"));
            add(new EmojiCode(":zd:","ⓓ"));
            add(new EmojiCode(":ze:","ⓔ"));
            add(new EmojiCode(":zf:","ⓕ"));
            add(new EmojiCode(":zg:","ⓖ"));
            add(new EmojiCode(":zh:","ⓗ"));
            add(new EmojiCode(":zi:","ⓘ"));
            add(new EmojiCode(":zj:","ⓙ"));
            add(new EmojiCode(":zk:","ⓚ"));
            add(new EmojiCode(":zl:","ⓛ"));
            add(new EmojiCode(":zm:","ⓜ"));
            add(new EmojiCode(":zn:","ⓝ"));
            add(new EmojiCode(":zo:","ⓞ"));
            add(new EmojiCode(":zp:","ⓟ"));
            add(new EmojiCode(":zq:","ⓠ"));
            add(new EmojiCode(":zr:","ⓡ"));
            add(new EmojiCode(":zs:","ⓢ"));
            add(new EmojiCode(":zt:","ⓣ"));
            add(new EmojiCode(":zu:","ⓤ"));
            add(new EmojiCode(":zv:","ⓥ"));
            add(new EmojiCode(":zw:","ⓦ"));
            add(new EmojiCode(":zx:","ⓧ"));
            add(new EmojiCode(":zy:","ⓨ"));
            add(new EmojiCode(":zz:","ⓩ"));
            //Uppercase Letters
            add(new EmojiCode(":za_:","Ⓐ"));
            add(new EmojiCode(":zb_:","Ⓑ"));
            add(new EmojiCode(":zc_:","Ⓒ"));
            add(new EmojiCode(":zd_:","Ⓓ"));
            add(new EmojiCode(":ze_:","Ⓔ"));
            add(new EmojiCode(":zf_:","Ⓕ"));
            add(new EmojiCode(":zg_:","Ⓖ"));
            add(new EmojiCode(":zh_:","Ⓗ"));
            add(new EmojiCode(":zi_:","Ⓘ"));
            add(new EmojiCode(":zj_:","Ⓙ"));
            add(new EmojiCode(":zk_:","Ⓚ"));
            add(new EmojiCode(":zl_:","Ⓛ"));
            add(new EmojiCode(":zm_:","Ⓜ"));
            add(new EmojiCode(":zn_:","Ⓝ"));
            add(new EmojiCode(":zo_:","Ⓞ"));
            add(new EmojiCode(":zp_:","Ⓟ"));
            add(new EmojiCode(":zq_:","Ⓠ"));
            add(new EmojiCode(":zr_:","Ⓡ"));
            add(new EmojiCode(":zs_:","Ⓢ"));
            add(new EmojiCode(":zt_:","Ⓣ"));
            add(new EmojiCode(":zu_:","Ⓤ"));
            add(new EmojiCode(":zv_:","Ⓥ"));
            add(new EmojiCode(":zw_:","Ⓦ"));
            add(new EmojiCode(":zx_:","Ⓧ"));
            add(new EmojiCode(":zy_:","Ⓨ"));
            add(new EmojiCode(":zz_:","Ⓩ"));
        }
    };
    public static ArrayList<String> allCodes = new ArrayList<>();
    public static ArrayList<String> allEmoji = new ArrayList<>();
    public static ArrayList<String> emojiCodesCombined = new ArrayList<>();
    static {
        for(EmojiCode ec: emojiCodes){
            allCodes.add(ec.getCode());
            allEmoji.add(ec.getEmoji());
            emojiCodesCombined.add(ec.getCode()+" "+ec.getEmoji());
        }
    }
}
