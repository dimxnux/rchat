import React, {useState} from 'react';
import './App.css';
import ChatList from './components/ChatList';
import ChatRightPanel from './components/ChatRightPanel';
import ChatRightPanelPlaceholder from './components/ChatRightPanelPlaceholder';

function App() {
  const [activeChat, setActiveChat] = useState(null);

  return (
    <>
      <div className="container">
        <ChatList setActiveChat={setActiveChat} />
        {activeChat
          ? <ChatRightPanel activeChat={activeChat} />
          : <ChatRightPanelPlaceholder />}
      </div>
    </>
  );
}

export default App;
