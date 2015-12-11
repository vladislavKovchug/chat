package com.teamdev.chat.service;


public interface ChatRoomService {

    Iterable<ChatRoomDTO> getChatRooms();
    void joinChatRoom(long actor, long chatRoom);
    void leaveChatRoom(long actor, long chatRoom);
    Iterable<UserService.UserProfileDTO> getUsersList(long chatRoom);

    class ChatRoomDTO{
        final Long id;
        final String name;

        public ChatRoomDTO(Long id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
