import React, {useEffect, useState} from 'react';
import './ChatList.css';
import axios from '../../config/axios';
import ChatItem from './ChatItem';

function ChatList({setActiveChat}) {
  const [chats, setChats] = useState([]);

  useEffect(() => {
    async function fetchChats() {
      try {
        const chatsResponse = await axios.get('/chats');
        setChats(chatsResponse.data);
      } catch(ex) {
        console.log(ex);
      }
    }
    fetchChats();
  }, []);

  const chatsList = chats.map(chat =>
    <ChatItem key={chat.id} chat={chat} onClick={() => setActiveChat(chat)} />
  );

  return (
    <div className="left">
      <h1>Chats</h1>
      <div className="chats">
        {chatsList}
      </div>
    </div>
  );
}

export default ChatList;