export interface User {
  id: number;
  login: string;
  firstName?: string;
  lastName?: string;
  locked?: boolean;
  email?:string;
}
