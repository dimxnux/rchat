import React, {useEffect, useRef, useState} from 'react';
import Message from './Message/Message.js';
import './ChatRightPanel.css';
import axios from '../../config/axios.js';

function ChatRightPanel({activeChat}) {
  const [messages, setMessages] = useState([]);
  const [messageContent, setMessageContent] = useState('');
  const inputRef = useRef(null);

  useEffect(() => {
    async function fetchMessages() {
      try {
        const messagesResponse = await axios.get(`/chats/${activeChat.id}/messages`);
        setMessages(messagesResponse.data);
      } catch(ex) {
        console.error(ex);
      }
    }
    fetchMessages();
  }, []);

  const handleKeyDown = (event) => {
    if (event.key === 'Enter') {
      event.preventDefault();
      sendMessage();
    }
  };

  const sendMessage = () => {
    // todo
  };

  const messagesList = messages.map(message =>
     <Message key={message.sender.concat(message.createdAt)} message={message} />
  );

  return (
    <div className="chat-content">
      <div className="chat-header"></div>
      <div className="messages-parent-container">
        <div className="messages-container">
          {messagesList}
        </div>
      </div>
      <div className="chat-input">
        <div contentEditable="true" data-placeholder="Type here..." onKeyDown={handleKeyDown}
             onInput={e => setMessageContent(e.target.textContent)}
             ref={inputRef}
        >
        </div>
        <button onClick={sendMessage}>Send</button>
      </div>
    </div>
  );
}

export default ChatRightPanel;