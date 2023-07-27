import React from 'react';
import './Message.css';

function Message({message}) {

  return (
    <div className="message">
      <div className="sender-info">
        <svg height="50" width="50">
          <circle cx="25" cy="25" r="20" stroke="black" strokeWidth="1" fill="red" />
          Sorry, your browser does not support inline SVG.
        </svg>
        <div>{message.sender}</div>
      </div>
      <div className="message-content">
        {message.content}
      </div>
    </div>
  );
}

export default Message;