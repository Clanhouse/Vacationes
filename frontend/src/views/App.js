import { BrowserRouter as Router, Route, Redirect } from 'react-router-dom';
import MainTemplate from 'components/templates/MainTemplate';
import LoginPage from 'views/LoginPage';
import RegisterPage from 'views/RegisterPage';

const App = () => {
  return (
    <MainTemplate>
      <Router>
        <Route path="/login">
          <LoginPage />
        </Route>
        <Route path="/register">
          <RegisterPage />
        </Route>
        <Route path="/forgot-password">
          <p>forgot-password page</p>
        </Route>
        <Route path="/favorites">
          <p>favorites page</p>
        </Route>
        <Route path="/" exact>
          <Redirect to="/login" />
        </Route>
      </Router>
    </MainTemplate>
  );
};

export default App;
