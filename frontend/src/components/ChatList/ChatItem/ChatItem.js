import React from 'react';

function ChatItem({chat, onClick}) {
  return (
    <div className="chat" onClick={onClick}></div>
  )
}

export default ChatItem;