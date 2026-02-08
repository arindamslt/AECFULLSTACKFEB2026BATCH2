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
function App() {
  return (
    <div className="App">
      <h2>REACT APP</h2>
    <Parent1/>
    </div>
  );
}

export default App;
