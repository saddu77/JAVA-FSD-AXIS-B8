import  { Link } from 'react-router-dom';
import { useState } from 'react';

function SignUp(){
    const [email,setEmail] = useState('');
    const [password,setPassword] = useState('');

    const setEmailId = (e) => {
        setEmail(e.target.value);
    }

    const setPass = (e) => {
        setPassword(e.target.value);
    }
    const register = () => {
        let data = {
            email: email,
            password: password
           }
     
      fetch('http://localhost:8080/user/create',{
        method:"POST",
        body: JSON.stringify(data),
        headers : {
            "Content-Type":"application/json",
            "Access-Control-Allow-Origin":"*"
        }
       }).then(response => response.json())
         .then(json => console.log(json));
    }
    return(
        <div>
             <h2> Sign Up</h2>
             Email: <input type="text" onChange={(e) => setEmailId(e)}/> <br /> <br />
             Password: <input type="password" onChange={(e) => setPass(e)}/> <br /> <br />
             <input type="submit" value="Sign Up" onClick={register} /> <br /> <br />
             <Link to="/login"> Already Registered !!! Login</Link>
        </div>
       
    )
}
export default SignUp;