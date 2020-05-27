package chat.dto;

import lombok.Data;

@Data
public class Message {
    private Long room;
    private String from;
    private String text;
}
