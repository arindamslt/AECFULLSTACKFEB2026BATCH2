//import logo from './logo.svg';
import './App.css';
import FunctionalComponent from './component/FunctionalComponent';
import StateDemo from './component/state/StateDemo';
import Profile from './component/state/Profile';
import User from './component/axios/User';
import "bootstrap/dist/css/bootstrap.css";
import UserInfo from './component/useeffect/UserInfo';
import Parent from './component/props/Parent';
import A from './component/propsdrilling/A';
import Parent1 from './component/contextapi/Parent1';

import Main from './component/condrend/Main';
import { Routes,Route } from 'react-router-dom';
import Nav from './component/route/Nav';
function App() {
  return (
    <div className="App">
      <h2>REACT APP</h2>
     <Nav/>
     <Routes>
       <Route path="/state" element={<StateDemo/> }/>
       <Route path="/profile" element={<Profile/> }/>
       <Route path="/props" element={<Parent/> }/>
        <Route path="/pdrilling" element={<A/> }/>
         <Route path="/context" element={<Parent1/> }/>
          <Route path="/axios" element={<User/> }/>
           <Route path="/useeffect" element={<UserInfo/> }/>
            <Route path="/crend" element={<Main/> }/>
     </Routes>
    </div>
  );
}

export default App;
